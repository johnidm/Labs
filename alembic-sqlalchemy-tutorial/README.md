## SQLAlchemy migration with Alembic


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

```
alembic history
alembic history -i
alembic upgrade +1 --sql
```
