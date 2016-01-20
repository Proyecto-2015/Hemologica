#rm -rf Hemologica
#git clone https://github.com/Proyecto-2015/Hemologica.git

HEMOLOGICA_DIR=/home/hemologica/Hemologica
HEMOLOGICA_SALUD_BACKEND_EAR=$HEMOLOGICA_DIR/Hemologica-Salud-Backend/Hemologica-Salud-Backend-ear/target/Hemologica-Salud-Backend-ear.ear
HEMOLOGICA_SALUD_FRONTEND_EAR=$HEMOLOGICA_DIR/Hemologica-Salud-Frontend/Hemologica-Salud-Frontend-ear/target/Hemologica-Salud-Frontend-ear.ear
HEMOLOGICA_YODONO_BACKEND_EAR=$HEMOLOGICA_DIR/Hemologica-Yodono-Backend/Hemologica-Yodono-Backend-ear/target/Hemologica-Yodono-Backend-ear.ear
HEMOLOGICA_YODONO_FRONTEND_EAR=$HEMOLOGICA_DIR/Hemologica-Yodono-Frontend/Hemologica-Yodono-Frontend-ear/target/Hemologica-Yodono-Frontend-ear.ear
HEMOLOGICA_SERVICE_WAR=$HEMOLOGICA_DIR/Hemologica-Service/target/Hemologica-Service-1.0.0.BUILD-SNAPSHOT.war

OPENEMPI_HOME=/home/hemologica/openempi-entity-3.0.0

WILDFLY_DIR=/srv/wildfly-8.2.1.Final
TOMCAT_DIR=/srv/apache-tomcat-8.0.11
BASEX_DIR=/srv/basex/basex-core
TOMCAT_DIR=/srv/apache-tomcat-7.0.63

DATABASE_SCRIPT=$HEMOLOGICA_DIR/Hemologica-DAO/src/main/resources/scripts/dump-20-01-2016-Bruno.sql

function restore_basex {
cd /srv/basex/basex-core

./etc/basexclient -U admin -P admin -c 'DROP DATABASE Hemologica-Donations'
./etc/basexclient -U admin -P admin -c 'DROP DATABASE Hemologica-Laboratory'
./etc/basexclient -U admin -P admin -c 'DROP DATABASE Hemologica-Transfusions'
./etc/basexclient -U admin -P admin -c 'CREATE DATABASE Hemologica-Donations'
./etc/basexclient -U admin -P admin -c 'CREATE DATABASE Hemologica-Laboratory'
./etc/basexclient -U admin -P admin -c 'CREATE DATABASE Hemologica-Transfusions'
cd

}

function restore_database {
mysql -u root -phemologica hemologica < $DATABASE_SCRIPT
}


function restore_openempi {
export PGPASSWORD=postgres
psql --username=postgres --host=localhost -c "DROP DATABASE openempi"	
psql --username=postgres --host=localhost -c "CREATE DATABASE openempi WITH ENCODING='UTF8' OWNER=openempi CONNECTION LIMIT=-1"	
export PGPASSWORD=openempi
psql --username=openempi --host=localhost openempi -f $OPENEMPI_HOME/conf/create_new_database_schema-3.0.0.sql
psql --username=openempi --host=localhost openempi -f $OPENEMPI_HOME/conf/create_person_entity_model_definition.sql
psql --username=openempi --host=localhost openempi -f $OPENEMPI_HOME/conf/create_person_reference_tables.sql

rm -rf $OPENEMPI_HOME/data
}

function start_openempi {
./$TOMCAT_HOME_OPENEMPI/bin/startup.sh

}

function stop_openempi {
./$TOMCAT_HOME_OPENEMPI/bin/shutdown.sh

}



# bajo y compilo todo
#cd Hemologica
#git pull
#mvn install
#cd ..

#apago los servicios

#service basex stop
sudo service hemologica stop
service hemologica-service stop
service activemq stop
#stop_openempi

# restauro las bases de datos
restore_basex
restore_database
#restore_openempi



# reemplazo versiones
cd
rm -rf $WILDFLY_DIR/standalone/deployments/*
rm -rf $WILDFLY_DIR/standalone/data/*
rm -rf $WILDFLY_DIR/standalone/temp/*
rm -rf $WILDFLY_DIR/standalone/log/*


rm -rf $WILDFLY_DIR/standalone/deployments/*
rm -rf $WILDFLY_DIR/standalone/data/*
rm -rf $WILDFLY_DIR/standalone/temp/*
rm -rf $WILDFLY_DIR/standalone/log/*


cp $HEMOLOGICA_SALUD_BACKEND_EAR $WILDFLY_DIR/standalone/deployments/
cp $HEMOLOGICA_SALUD_FRONTEND_EAR $WILDFLY_DIR/standalone/deployments/
cp $HEMOLOGICA_YODONO_BACKEND_EAR $WILDFLY_DIR/standalone/deployments/
cp $HEMOLOGICA_YODONO_FRONTEND_EAR $WILDFLY_DIR/standalone/deployments/
cp $HEMOLOGICA_SERVICE_WAR $TOMCAT_DIR/webapps/


#service basex start
#service openempi start
#start_openempi
sudo service hemologica start
service hemologica-service start
service activemq start

sudo service monit restart
