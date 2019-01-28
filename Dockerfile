FROM openjdk:8-jre

ENV SERVER_PORT 38080
EXPOSE $SERVER_PORT

COPY target/spring-boot-embedded-tomcat-0.0.1-SNAPSHOT.jar /

CMD [ "java", "-jar", "/spring-boot-embedded-tomcat-0.0.1-SNAPSHOT.jar" ]
