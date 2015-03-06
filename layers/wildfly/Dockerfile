FROM kyuff/java

RUN apt-get install -y wget

RUN wget -nv http://download.jboss.org/wildfly/8.2.0.Final/wildfly-8.2.0.Final.tar.gz -O /opt/wildfly.tar.gz

RUN tar xzf /opt/wildfly.tar.gz -C /opt/

RUN rm /opt/wildfly.tar.gz

ENV WILDFLY_HOME /opt/wildfly-8.2.0.Final

COPY modules/ $WILDFLY_HOME/modules/

EXPOSE 8080 9990
