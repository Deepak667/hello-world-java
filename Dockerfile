FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY helloworld.class .

CMD ["java", "helloworld"]
