FROM jenkins/jenkins:lts

USER root

RUN apt-get update && \
    apt-get install -y docker.io git && \
    rm -rf /var/lib/apt/lists/*

RUN groupadd -g 999 docker || true
RUN usermod -aG docker jenkins

USER jenkins
