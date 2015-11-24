
-- Tipos de sangre --
INSERT INTO `hemologica`.`blood_abo_types_codes` (`blood_abo_type_code_id`, `blood_abo_type_code_value`, `blood_abo_type_code_label`, `blood_abo_type_code_snomed`) VALUES ('1', '1', 'A', '1');
INSERT INTO `hemologica`.`blood_abo_types_codes` (`blood_abo_type_code_id`, `blood_abo_type_code_value`, `blood_abo_type_code_label`, `blood_abo_type_code_snomed`) VALUES ('2', '2', 'AB', '2');
INSERT INTO `hemologica`.`blood_abo_types_codes` (`blood_abo_type_code_id`, `blood_abo_type_code_value`, `blood_abo_type_code_label`, `blood_abo_type_code_snomed`) VALUES ('3', '3', 'B', '3');
INSERT INTO `hemologica`.`blood_abo_types_codes` (`blood_abo_type_code_id`, `blood_abo_type_code_value`, `blood_abo_type_code_label`, `blood_abo_type_code_snomed`) VALUES ('4', '4', 'O', '4');

INSERT INTO `hemologica`.`blood_d_types_codes` (`blood_d_type_code_id`, `blood_d_type_code_value`, `blood_d_type_code_label`, `blood_d_type_code_snomed`) VALUES ('1', '1', 'RH+', '6');
INSERT INTO `hemologica`.`blood_d_types_codes` (`blood_d_type_code_id`, `blood_d_type_code_value`, `blood_d_type_code_label`, `blood_d_type_code_snomed`) VALUES ('2', '2', 'RH-', '5');

-- Productos --
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('1', 'Plaquetas', '1', '7');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('2', 'Crioprecipitado', '2', '8');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('3', 'Plasma', '3', '9');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('4', 'Eritrocitos', '4', '10');

-- INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('1', 'label_plaquetas', '1', '7');
-- INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('2', 'label_crioprecipitado', '2', '8');
-- INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('3', 'label_plasma', '3', '9');
-- INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('4', 'label_eritrocitos', '4', '10');