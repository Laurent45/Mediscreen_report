
FROM amazoncorretto:11.0.14
ARG JAR_FILE=build/libs/Mediscreen_report-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} reportPatient.jar
ENTRYPOINT ["java", "-jar", "reportPatient.jar"]