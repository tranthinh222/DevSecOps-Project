FROM jenkins/agent:jdk17

USER root

RUN apt-get update && \
    apt-get install -y docker.io && \
    apt-get clean

USER jenkins
