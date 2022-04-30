FROM openjdk:11
EXPOSE 6060
EXPOSE 6070
ARG JAR_FILE=target/monitoring-sample.jar
COPY ${JAR_FILE} /opt/monitoring-sample.jar
RUN apt-get update
RUN apt-get upgrade -y
RUN apt-get install curl telnet vim -y
ENTRYPOINT ["/opt/monitoring-sample.jar"]