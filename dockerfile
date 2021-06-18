FROM demo/oracle-java:16
ARG JAR_FILE=target/apialumno.jar
COPY ${JAR_FILE} api.jar
ENTRYPOINT ["java","-jar","/api.jar"]