FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} department.jar
ENTRYPOINT ["java","-jar","/department.jar"]
EXPOSE 9001