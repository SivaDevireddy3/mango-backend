# Use Java 21
FROM eclipse-temurin:21-jdk

# Copy jar file
COPY target/*.jar app.jar

# Run the application
ENTRYPOINT ["java","-jar","/app.jar"]