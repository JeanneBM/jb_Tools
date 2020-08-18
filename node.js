FROM node:11.11.0
LABEL "maintainer"="anna@example.com"
LABEL "rating"="Five Stars" "class"="First Class"

USER root

ENV AP /data/app
ENV SCPATH /etc/supervisior/conf.d

RUN apt-get -y update

# The deamons 
RUN apt-get -y install supervisior
RUN mkdir -p /var/log/supervisior

# SUpervisior Configuration
ADD ./supervisord/conf.d/* $SCPATH/

#Application Code
ADD *.js* $AP/

WORKDIR $AP

RUN npm install

CMD ["supervisord", "-n"]

