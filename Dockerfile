FROM ubuntu:latest
LABEL authors="djina"
ENTRYPOINT ["top", "-b"]
FROM openjdk:17-jdk
WORKDIR /app
COPY build/libs/quickquestapp-0.0.1-SNAPSHOT.jar /app/quickquestapp.jar
EXPOSE 8080
CMD ["java", "-jar", "quickquestapp.jar"]