# build step
FROM maven:3.8.4-openjdk-17 as build

WORKDIR /app

COPY . ./

RUN mvn clean package -DskipTests

# realease step
FROM openjdk:8-jdk-alpine as release

ARG WAR_FILE=/app/target/tistech-api-0.0.1-SNAPSHOT.war

COPY --from=build  $WAR_FILE app.war

EXPOSE 8081

CMD ["java","-jar","/app.war"]
