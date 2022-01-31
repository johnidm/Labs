DOCKER_IMAGE=tistech-api:latest

test:
	@mvn clean test

run:
	@mvn clean install -DskipTests
	@java -jar target/tistech-api-0.0.1-SNAPSHOT.war

docker-build:
	@docker build -t ${DOCKER_IMAGE} .

docker-run: docker-build
	@docker run -it --rm -p 8081:8081 ${DOCKER_IMAGE}
