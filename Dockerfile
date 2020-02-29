FROM openjdk
FROM openjdk:8
EXPOSE 9002
ADD target/firstmicroservice.jar firstmicroservice.jar
ENTRYPOINT ["java","-jar","firstmicroservice.jar"]