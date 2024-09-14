FROM gradle:8.10-alpine AS build
WORKDIR /app
COPY . .
RUN ./gradlew dependencies
RUN ./gradlew build

FROM amazoncorretto:21-alpine
WORKDIR /app
COPY --from=build /app/build/libs/javaperfomance-1.0.0.jar app.jar

EXPOSE 10003
ENTRYPOINT java -jar app.jar