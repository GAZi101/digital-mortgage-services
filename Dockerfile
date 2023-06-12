FROM openjdk:17-alpine as RUN-APPS
USER root
LABEL DEVELOPER="gemardy@gmail.com"
LABEL APPS-NAME="digital-mortgage-service"
WORKDIR /apps
COPY --from=BUILD-APPS /build-apps/target/*.jar /apps/apps.jar
RUN ls -ltr
ENTRYPOINT [ "java","-jar","apps.jar"]
