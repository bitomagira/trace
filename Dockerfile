FROM openjdk:12
EXPOSE 8080
ADD target/trace2-0.0.1-SNAPSHOT.jar trace2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/trace2-0.0.1-SNAPSHOT.jar"]