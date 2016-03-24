-- Estos datos no son correctos - 21/11/2015

-- INSTITUCIONES --
INSERT INTO `institutions` (`id`,`institution_code`,`institution_display_name`,`institution_oid`) VALUES (1,'2.16.858.0.0.1.10.2.3.6','Hospital de Clinicas','2.16.858.0.0.1.10.2.3.6');
INSERT INTO `institutions` (`id`,`institution_code`,`institution_display_name`,`institution_oid`) VALUES (2,'2.16.858.0.2.16.86.1.0.0.212567060019','Asociacion Española','2.16.858.0.2.16.86.1.0.0.212567060019');
INSERT INTO `institutions` (`id`,`institution_code`,`institution_display_name`,`institution_oid`) VALUES (2,'2.16.858.0.2.16.86.1.0.0.212701040013','Médica Uruguaya','2.16.858.0.2.16.86.1.0.0.212701040013');
INSERT INTO `institutions` (`id`,`institution_code`,`institution_display_name`,`institution_oid`) VALUES (2,'2.16.858.0.2.16.86.1.0.0.216309010011','Casmu','2.16.858.0.2.16.86.1.0.0.216309010011');


-- BANCOS --

INSERT INTO `hemologica`.`geo_locations` (`geo_location_id`, `geo_locations_x`, `geo_locations_y`) VALUES ('1', '-34.898930','-56.165753');
INSERT INTO `hemologica`.`geo_locations` (`geo_location_id`, `geo_locations_x`, `geo_locations_y`) VALUES ('2', '-34.871729', '-56.188868');
INSERT INTO `hemologica`.`geo_locations` (`geo_location_id`, `geo_locations_x`, `geo_locations_y`) VALUES ('3', '-34.758027', '-56.272928');

INSERT INTO `hemologica`.`centers` (`id`, `center_institution_id`, `center_code`, `center_display_name`, `center_location`, `center_oid`, `center_address`, `center_email`, `center_hour`, `center_information`, `center_telephone`, `center_type`) VALUES ('1', '1', '345', 'Banco de Sangre 1', '1', '987658', 'Av Italia 345', 'infobanco1@hc.com', 'Lunes a viernes de 8 - 18 hs ', 'Se dan 40 numeros a partir de las 8 am.', '12345678', 0);
INSERT INTO `hemologica`.`centers` (`id`, `center_institution_id`, `center_code`, `center_display_name`, `center_location`, `center_oid`, `center_address`, `center_email`, `center_hour`, `center_information`, `center_telephone`, `center_type`) VALUES ('2', '2', '346', 'Banco de Sangre 2', '2', '654789', 'Rivera 567', 'infobanco2@hc.com', 'Lunes a viernes de 8 - 20 hs y Sabados 8 - 12 ', 'Pedir hora por telefono', '098765432', 0);
INSERT INTO `hemologica`.`centers` (`id`, `center_institution_id`, `center_code`, `center_display_name`, `center_location`, `center_oid`, `center_address`, `center_email`, `center_hour`, `center_information`, `center_telephone`, `center_type`) VALUES ('3', '2', '347', 'Banco de Sangre 3', '3' , '356789', 'Melilla 7356', 'infobanco3@hc.com', 'Lunes a jueves de 8 - 20 hs y Sabados 8 - 12 ', 'Pedir hora por la pagina web bancoDesangre3.org.uy', '098765432', 0);

-- CENTRO TRANSFUSIONALES --

INSERT INTO `hemologica`.`centers` (`id`, `center_institution_id`, `center_code`, `center_display_name`, `center_oid`, `center_type`) VALUES ('4', '1', '348', 'Centro Transfusional 1', '098755', '1');
INSERT INTO `hemologica`.`centers` (`id`, `center_institution_id`, `center_code`, `center_display_name`, `center_oid`, `center_type`) VALUES ('5', '2', '349', 'Centro Transfusional 2', '567876', '1');
