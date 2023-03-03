## SQLAlchemy migration with Alembic

Install the dependencies
```
pip install alembic sqlalchemy
```

Initialize the migrations engine

```
alembic init migrations
```

Create the first migration
```
alembic revision --autogenerate -m "Create user model"
``` 

Apply the migrations to database
```
alembic upgrade heads
```

Create the second migration and apply the migrations
```
alembic revision --autogenerate -m "Active collumn"
alembic upgrade heads
```