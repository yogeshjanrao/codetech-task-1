# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /

# Copy the application WAR file into the container
COPY target/*.jar application.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "application.jar"]