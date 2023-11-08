################################## DockerFile ##################

FROM jenkins/jenkins

USER root

#Define variables prued

ENV MAVEN_VERSION 3.9.5



#Update Base OS and install additional tools

RUN apt-get update && apt-get install -y wget

RUN  wget --no-verbose https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.tar.gz -P /tmp/

RUN tar xzf /tmp/apache-maven-$MAVEN_VERSION-bin.tar.gz -C /opt/

RUN ln -s  /opt/apache-maven-$MAVEN_VERSION /opt/maven

RUN ln -s /opt/maven/bin/mvn /usr/local/bin

RUN rm /tmp/apache-maven-$MAVEN_VERSION-bin.tar.gz



# Update https://stackoverflow.com/questions/38675925/is-it-possible-to-install-only-the-docker-cli-and-not-the-daemon

ENV DOCKERVERSION=24.0.7-ce

RUN curl -fsSLO https://download.docker.com/linux/static/stable/x86_64/docker-rootless-extras-24.0.7.tgz \
                
  && tar xzvf docker-${24.0.7}.tgz --strip 1 \

                 -C /usr/local/bin docker/docker \

  && rm docker-${24.0.7}.tgz



#Set up permissions

RUN chown jenkins:jenkins /opt/maven;

ENV MAVEN_HOME=/opt/mvn

USER jenkins

################################## DockerFile ##################