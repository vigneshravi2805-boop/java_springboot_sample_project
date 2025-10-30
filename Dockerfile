# Stage 1: build
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: run
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/spring-boot-sample-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
