# Exemplo de uso de cache no Redis

- http://localhost:8000/
- http://localhost:5000/docs

```
uvicorn app.app:app --host 0.0.0.0 --port 5000 --reload
```

```
curl http://localhost:5000/user/3
```