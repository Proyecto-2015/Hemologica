cd Hemologica-DataTypes
mvn install
cd ..
echo "Build: Hemologica-DataTypes"
cd Hemologica-XMLDataBase-Connection
mvn install
cd ..
echo "Build: Hemologica-XMLDatabase-Connection"
cd Hemologica-DAO
mvn install
cd ..
echo "Build: Hemologica-DAO"
cd Hemologica-Yodono-Backend
mvn install
cd ..
echo "Build: Hemologica-Yodono-Backend"
cd Hemologica-Yodono-Frontend
mvn install
cd ..
echo "Build: Hemologica-Yodono-Frontend"
cd Hemologica-Salud-Backend
mvn install
cd ..
echo "Build: Hemologica-Salud-Backend"
cd Hemologica-Salud-Frontend
mvn install
cd ..
echo "Build: Hemologica-Salud-Frontend"

# Hemologica Service
cd Hemologica-Service-EMPI-Adapter
mvn install
cd ..
echo "Build: Hemologica-Service-EMPI-Adapter"
cd Hemologica-XDS-Repository-Adapter
mvn install
cd ..
echo "Build: Hemologica-Service-XDS-Repository-Adapter"
cd Hemologica-Service
mvn install
cd ..
echo "Build: Hemologica-Service"