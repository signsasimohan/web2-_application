
FROM eclipse-temurin:17
COPY target/webapp.jar sasiweb.jar
CMD [ "java","-jar","sasiweb.jar" ]
