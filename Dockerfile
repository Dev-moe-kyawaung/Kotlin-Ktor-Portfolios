FROM eclipse-temurin:21-jre

WORKDIR /app
COPY build/install/ktor-portfolio/ ./

EXPOSE 8080
CMD ["bin/ktor-portfolio"]
