DIR=$1
BASEXCORE=/home/bruno/Desarrollo/Servidores/basex/basex-core/etc
echo "Exportar archivos del basex a: $DIR"
rm -rf $DIR/Hemologica-Donations
rm -rf $DIR/Hemologica-Transfusions
rm -rf $DIR/Hemologica-Laboratory 
mkdir $DIR/Hemologica-Donations
mkdir $DIR/Hemologica-Transfusions
mkdir $DIR/Hemologica-Laboratory
AUX=$(pwd)
cd $BASEXCORE
./basexclient -U admin -P admin -i Hemologica-Donations -c "export $DIR/Hemologica-Donations"
./basexclient -U admin -P admin -i Hemologica-Transfusions -c "export $DIR/Hemologica-Transfusions"
./basexclient -U admin -P admin -i Hemologica-Laboratory -c "export $DIR/Hemologica-Laboratory"
cd "$AUX"
