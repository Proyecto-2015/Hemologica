echo ".................snomed.sql"
mysql -u root -p.lh2324 hemologica < snomed.sql
echo ".................confuguration.sql"
mysql -u root -p.lh2324 hemologica < configuration.sql
echo ".................codes.sql"
mysql -u root -p.lh2324 hemologica < codes.sql
echo ".................centers.sql"
mysql -u root -p.lh2324 hemologica < centers.sql
echo ".................persons.sql"
mysql -u root -p.lh2324 hemologica < persons.sql
echo ".................blood.sql"
mysql -u root -p.lh2324 hemologica < blood.sql
echo ".................donation.sql"
mysql -u root -p.lh2324 hemologica < donation.sql
echo ".................transfusion.sql"
mysql -u root -p.lh2324 hemologica < transfusion.sql
echo ".................units_movements.sql"
mysql -u root -p.lh2324 hemologica < units_movements.sql
echo ".................advertisment.sql"
mysql -u root -p.lh2324 hemologica < advertisment.sql

