
-- Tipos de sangre --
INSERT INTO `hemologica`.`blood_abo_types_codes` (`blood_abo_type_code_id`, `blood_abo_type_code_value`, `blood_abo_type_code_label`, `blood_abo_type_code_snomed`) VALUES ('1', '1', 'A', '1');
INSERT INTO `hemologica`.`blood_abo_types_codes` (`blood_abo_type_code_id`, `blood_abo_type_code_value`, `blood_abo_type_code_label`, `blood_abo_type_code_snomed`) VALUES ('2', '2', 'AB', '2');
INSERT INTO `hemologica`.`blood_abo_types_codes` (`blood_abo_type_code_id`, `blood_abo_type_code_value`, `blood_abo_type_code_label`, `blood_abo_type_code_snomed`) VALUES ('3', '3', 'B', '3');
INSERT INTO `hemologica`.`blood_abo_types_codes` (`blood_abo_type_code_id`, `blood_abo_type_code_value`, `blood_abo_type_code_label`, `blood_abo_type_code_snomed`) VALUES ('4', '4', 'O', '4');

INSERT INTO `hemologica`.`blood_d_types_codes` (`blood_d_type_code_id`, `blood_d_type_code_value`, `blood_d_type_code_label`, `blood_d_type_code_snomed`) VALUES ('1', '1', 'RH+', '6');
INSERT INTO `hemologica`.`blood_d_types_codes` (`blood_d_type_code_id`, `blood_d_type_code_value`, `blood_d_type_code_label`, `blood_d_type_code_snomed`) VALUES ('2', '2', 'RH-', '5');

INSERT INTO `hemologica`.`blood_types_codes` (`blood_type_code_id`, `blood_type_code_label`, `blood_type_code_value`, `blood_type_code_snomed`, `blood_abo_type_code_snomed`, `blood_rh_type_code_snomed`) VALUES ('1', 'label_orh-', '1', '31', '4', '2');
INSERT INTO `hemologica`.`blood_types_codes` (`blood_type_code_id`, `blood_type_code_label`, `blood_type_code_value`, `blood_type_code_snomed`, `blood_abo_type_code_snomed`, `blood_rh_type_code_snomed`) VALUES ('2', 'label_orh+', '2', '32', '4', '1');
INSERT INTO `hemologica`.`blood_types_codes` (`blood_type_code_id`, `blood_type_code_label`, `blood_type_code_value`, `blood_type_code_snomed`, `blood_abo_type_code_snomed`, `blood_rh_type_code_snomed`) VALUES ('3', 'label_arh-', '3', '33', '1', '2');
INSERT INTO `hemologica`.`blood_types_codes` (`blood_type_code_id`, `blood_type_code_label`, `blood_type_code_value`, `blood_type_code_snomed`, `blood_abo_type_code_snomed`, `blood_rh_type_code_snomed`) VALUES ('4', 'label_arh+', '4', '34', '1', '1');
INSERT INTO `hemologica`.`blood_types_codes` (`blood_type_code_id`, `blood_type_code_label`, `blood_type_code_value`, `blood_type_code_snomed`, `blood_abo_type_code_snomed`, `blood_rh_type_code_snomed`) VALUES ('5', 'label_abrh-', '5', '35', '2', '2');
INSERT INTO `hemologica`.`blood_types_codes` (`blood_type_code_id`, `blood_type_code_label`, `blood_type_code_value`, `blood_type_code_snomed`, `blood_abo_type_code_snomed`, `blood_rh_type_code_snomed`) VALUES ('6', 'label_abh+', '6', '36', '2', '1');
INSERT INTO `hemologica`.`blood_types_codes` (`blood_type_code_id`, `blood_type_code_label`, `blood_type_code_value`, `blood_type_code_snomed`, `blood_abo_type_code_snomed`, `blood_rh_type_code_snomed`) VALUES ('7', 'label_brh-', '7', '37', '3', '2');
INSERT INTO `hemologica`.`blood_types_codes` (`blood_type_code_id`, `blood_type_code_label`, `blood_type_code_value`, `blood_type_code_snomed`, `blood_abo_type_code_snomed`, `blood_rh_type_code_snomed`) VALUES ('8', 'label_brh+', '8', '38', '3', '1');

-- Productos --
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('1', 'Plaquetas', '1', '7');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('2', 'Crioprecipitado', '2', '8');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('3', 'Plasma', '3', '9');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('4', 'Eritrocitos', '4', '10');

UPDATE `hemologica`.`units_types` SET `unit_type_code_label`='label_plaquetas' WHERE `unit_type_id`='1';
UPDATE `hemologica`.`units_types` SET `unit_type_code_label`='label_crioprecipitado' WHERE `unit_type_id`='2';
UPDATE `hemologica`.`units_types` SET `unit_type_code_label`='label_plasma' WHERE `unit_type_id`='3';
UPDATE `hemologica`.`units_types` SET `unit_type_code_label`='label_eritrocitos' WHERE `unit_type_id`='4';



-- INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('1', 'label_plaquetas', '1', '7');
-- INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('2', 'label_crioprecipitado', '2', '8');
-- INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('3', 'label_plasma', '3', '9');
-- INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('4', 'label_eritrocitos', '4', '10');