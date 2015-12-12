
-- CODIGOS --

-- Tipo de Sangre ABO
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('1', '112144000');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('2', '165743006');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('3', '112149005');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('4', '58460004');

-- Tipo de Sangre RH
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('5', '165746003');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('6', '165747007');

-- Tipo Producto - Plasma...
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('7', '256395009');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('8', '256401009');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('9', '256400005');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('10', '126242007');

-- Motivos rechazo Donacion
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('11', '22370005');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('12', '161462004');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('13', '12763006');

-- Analisis a Donación 
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('14', '40675008');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('15', '413107006');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('16', '31676001');

-- Evento adverso Donacion
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('17', '404640003');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('18', '248228001');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('19', '91175000');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('20', '422400008');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('21', '385494008');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('22', '698247007');

-- Analisis a Transfusión
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('23', '77020008');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('24', '16742006');

-- Evento adverso Transfusión
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('25', '73301000');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('26', '69281008');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('27', '341009');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('28', '88924008');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('29', '73301000');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('30', '361098001');

-- tipos de sangre junto ab+ ab- ...
INSERT INTO `concepts` (`id`,`concept_code`) VALUES (31,'278148006');
INSERT INTO `concepts` (`id`,`concept_code`) VALUES (32,'278147001');
INSERT INTO `concepts` (`id`,`concept_code`) VALUES (33,'278152006');
INSERT INTO `concepts` (`id`,`concept_code`) VALUES (34,'278149003');
INSERT INTO `concepts` (`id`,`concept_code`) VALUES (35,'278154007');
INSERT INTO `concepts` (`id`,`concept_code`) VALUES (36,'278151004');
INSERT INTO `concepts` (`id`,`concept_code`) VALUES (37,'278153001');
INSERT INTO `concepts` (`id`,`concept_code`) VALUES (38,'278150003');

-- Tipos de donacion
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('39', '1788001');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('40', '42736004');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('41', '233555005');
 
-- Severidad
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('42', '255604002');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('43', '6736007');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('44', '24484000');

-- Resultados positivo - negativo
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('45', '10828004');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('46', '260385009');

-- Permanente y temporal 
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('47', '6934004');
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('48', '14803004');

-- aferesis
INSERT INTO `hemologica`.`concepts` (`id`, `concept_code`) VALUES ('49', '127788007');


UPDATE `hemologica`.`concepts` SET `concept_code`='255604002' WHERE `id`='42';




