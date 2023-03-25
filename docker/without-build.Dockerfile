FROM openjdk:17 as RUN-APPS
LABEL DEVELOPER="gemardy@gmail.com"
LABEL APPS-NAME="digital-mortgage-service"
USER root
WORKDIR /apps

COPY target/*.jar /apps/app.jar
RUN ls -ltr
ENTRYPOINT [ "java","-jar","app.jar"]
