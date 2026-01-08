FROM jenkins/agent:latest

USER root

RUN apt-get update && \
    apt-get install -y docker.io git && \
    getent group docker || groupadd -g 999 docker && \
    usermod -aG docker jenkins

USER jenkins
