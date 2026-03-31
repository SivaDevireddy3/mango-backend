# Use Java 21
FROM openjdk:21-jdk-slim

# Copy jar file
COPY target/*.jar app.jar

# Run the application
ENTRYPOINT ["java","-jar","/app.jar"]