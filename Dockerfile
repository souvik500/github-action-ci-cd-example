FROM openjdk:17
EXPOSE 9090
ADD target/springboot-image-githubactions-cicd.jar springboot-image-githubactions-cicd.jar
ENTRYPOINT ["java","springboot-image-githubactions-cicd.jar"]
