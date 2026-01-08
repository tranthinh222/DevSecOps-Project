FROM jenkins/inbound-agent:latest

USER root

RUN groupadd -g 983 docker && usermod -aG docker jenkins

RUN apt-get update && apt-get install -y docker.io \
	&& rm -rf /var/lib/apt/lists/*

USER jenkins