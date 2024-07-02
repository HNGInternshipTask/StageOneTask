# Build stage
FROM maven:3.8.7 AS build
WORKDIR /app
COPY . .
RUN mvn -B clean package -DskipTests

# Run stage
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/*.jar StageOneTask.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "StageOneTask.jar"]


