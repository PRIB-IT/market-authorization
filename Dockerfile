FROM openjdk:18-jdk-alpine3.14

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/token-authorization-service.jar token-authorization-service.jar

# Run the jar file
ENTRYPOINT ["java","-jar","token-authorization-service.jar"]