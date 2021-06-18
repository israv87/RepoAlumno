FROM apirestalumnos/oracle-java:11
ARG JAR_FILE=target/ApiRestAlumnos.jar
COPY ${JAR_FILE} api.jar
ENTRYPOINT ["java","-jar","/api.jar"]