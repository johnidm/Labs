from . import config
import aioredis
import httpx
from fastapi import FastAPI
from datetime import timedelta
import json

redis = aioredis.from_url(config.REDIS_URI, encoding="utf-8", decode_responses=True)


async def get_user_from_api(id: int) -> dict:
    async with httpx.AsyncClient() as client:
        url = f"https://reqres.in/api/users/{id}"
        response = await client.get(url)

        response.raise_for_status()

        return response.json()


async def get_user_from_cache(key: str) -> str:
    return await redis.get(key)


async def set_user_to_cache(key: str, value: str) -> bool:

    state = await redis.setex(
        key,
        timedelta(seconds=config.CACHE_EXPIRE),
        value=value,
    )
    return state


async def route_user(id: int) -> dict:

    user = await get_user_from_cache(key=id)

    if user is not None:
        data = {"data": json.loads(user), "cache": True}
        return data
    else:
        user = await get_user_from_api(id)

        value = json.dumps(user["data"])
        state = await set_user_to_cache(key=id, value=value)

        if not state:
            pass

        data = {"data": json.loads(value), "cache": False}
        return data


app = FastAPI()


@app.get("/user/{id}")
async def user(id: int) -> dict:
    return await route_user(id)
