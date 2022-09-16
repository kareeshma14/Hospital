FROM openjdk:11
EXPOSE 8089
ADD target/doc-data-final.jar doc-data-final.jar
ENTRYPOINT ["java","-jar","/doc-data-final.jar"]