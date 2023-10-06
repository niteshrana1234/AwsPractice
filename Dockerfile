FROM openjdk:11
COPY target/AwsPractice.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar",""]
