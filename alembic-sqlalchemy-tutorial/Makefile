pip:
	@pip install sqlalchemy psycopg2 alembic

run:
	@docker run --rm -d --name postgres -e POSTGRES_USER=root -e POSTGRES_PASSWORD=root -p 5432:5432 postgres

ps:
	docker ps

stop:
	docker ps -q --filter ancestor="postgres" | xargs -r docker stop

postgres:
	@docker run --rm -d --name postgres -e POSTGRES_USER=root -e POSTGRES_PASSWORD=root -p 5432:5432 postgres	
	@docker exec -it postgres psql -U root
	# CREATE DATABASE models;
	# \c sigtint;
	# CREATE SCHEMA prod01sa AUTHORIZATION root;
