FROM openjdk:23-ea-jdk-oraclelinux9
RUN mkdir /app
ENV SIMPLE_PORT 8087
EXPOSE ${SIMPLE_PORT}
ADD ./simple.jar /app/simple.jar                         	 	
MAINTAINER "Abhijeet Patil"
ENTRYPOINT ["java", "-jar", "/app/simple.jar"]