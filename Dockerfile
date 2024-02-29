FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY ./target/dscommerceApi-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
