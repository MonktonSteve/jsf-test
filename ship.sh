$CATALINA_HOME/bin/shutdown.sh
rm $CATALINA_HOME/logs/catalina.out
rm $CATALINA_HOME/webapps/helloworld*
cp target/helloworld.war $CATALINA_HOME/webapps
$CATALINA_HOME/bin/startup.sh
