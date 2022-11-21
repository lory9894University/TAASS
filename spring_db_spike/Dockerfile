FROM openjdk:11
LABEL author="Gianguria"
RUN groupadd -r spring && useradd -r -gspring spring
VOLUME /tmp
EXPOSE 8080
ARG DEPENDENCY=target
ADD ${DEPENDENCY}/*.jar spike-spring-docker.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./spike-spring-docker.jar"]