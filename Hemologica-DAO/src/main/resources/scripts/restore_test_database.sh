BASEXCORE=/home/bruno/Desarrollo/Servidores/basex/basex-core/etc
AUX=$(pwd)
cd $BASEXCORE
./basexclient -U admin -P admin -c "drop database Hemologica-Donations"
./basexclient -U admin -P admin -c "drop database Hemologica-Transfusions"
./basexclient -U admin -P admin -c "drop database Hemologica-Laboratory"
./basexclient -U admin -P admin -c "create database Hemologica-Donations"
./basexclient -U admin -P admin -c "create database Hemologica-Transfusions"
./basexclient -U admin -P admin -c "create database Hemologica-Laboratory"
cd "$AUX"
mysql -u root -p.lh2324 < ~/dumps/Dump20160325_hemologica.sql
