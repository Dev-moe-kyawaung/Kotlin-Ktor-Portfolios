# Kotlin + Ktor Portfolio

A server-rendered portfolio built with Kotlin, Ktor, and Thymeleaf.

## Run locally
```bash
./gradlew run
./gradlew installDist
docker build -t ktor-portfolio .
docker run -p 8080:8080 ktor-portfolio
