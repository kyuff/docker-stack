FROM kyuff/wildfly

RUN $WILDFLY_HOME/bin/add-user.sh admin admin --silent

COPY configuration/ $WILDFLY_HOME/standalone/configuration/

#COPY app.war $WILDFLY_HOME/standalone/deployments/

CMD $WILDFLY_HOME/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0

