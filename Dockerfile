FROM openjdk:11-jdk
ENV SECRET_KEY=mongodb+srv://Form:formpass@cluster0.ir7prkj.mongodb.net/courses?retryWrites=true&w=majority
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
