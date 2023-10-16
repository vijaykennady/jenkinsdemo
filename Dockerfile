FROM eclipse-temurin:17
COPY target/jenkinsDemo.jar j.jar
CMD [ "java","-jar","j.jar" ]