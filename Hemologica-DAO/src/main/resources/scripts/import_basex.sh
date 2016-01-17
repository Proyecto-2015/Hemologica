DIR=$1
BASEXCORE=/home/bruno/Desarrollo/Servidores/basex/basex-core/etc
echo "Importar archivos al basex desde: $DIR"
AUX=$(pwd)
cd $BASEXCORE
./basexclient -U admin -P admin -i Hemologica-Donations -c "add $DIR/Hemologica-Donations/"
./basexclient -U admin -P admin -i Hemologica-Transfusions -c "add $DIR/Hemologica-Transfusions/"
./basexclient -U admin -P admin -i Hemologica-Laboratory -c "add $DIR/Hemologica-Laboratory/"
cd "$AUX"
