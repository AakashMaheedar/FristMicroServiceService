FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/FristMicroService.jar FristMicroService.jar
ENTRYPOINT ["java","-jar","FristMicroService.jar"]