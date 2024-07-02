# Build stage
FROM maven:3.8.7 AS build
WORKDIR /app
COPY . .
RUN mvn -B clean package -DskipTests

# Run stage
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/*.jar StageOneTask.jar
COPY src/main/resources/secret.properties src/main/resources/secret.properties
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "StageOneTask.jar"]