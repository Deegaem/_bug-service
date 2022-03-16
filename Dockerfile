FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} bugs.jar
ENTRYPOINT ["java", "-jar" , "-Dserver.port=8081" , "/bugs.jar"]