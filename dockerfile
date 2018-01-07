FROM openjdk:8

RUN mkdir /discount

WORKDIR /discount

COPY . ./discount
ADD . /discount

EXPOSE 8086

CMD ["java", "-jar", "target/discount-service-2.5.0-SNAPSHOT.jar"]