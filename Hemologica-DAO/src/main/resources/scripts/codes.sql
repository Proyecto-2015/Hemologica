
-- Mensajes habilitodos - todos
INSERT INTO `hemologica`.`message_send_Option` (`id`, `label`) VALUES ('1', 'label_all');
INSERT INTO `hemologica`.`message_send_Option` (`id`, `label`) VALUES ('2', 'label_enable');

-- Tipos de Documentos
INSERT INTO `hemologica`.`documents_types_codes` (`id`, `documents_type_code_label`, `documents_type_code_value`) VALUES ('1', 'label_cedula', '1');
INSERT INTO `hemologica`.`documents_types_codes` (`id`, `documents_type_code_label`, `documents_type_code_value`) VALUES ('2', 'label_passport', '2');

UPDATE `hemologica`.`documents_types_codes` SET `documents_type_code_value`='68909' WHERE `id`='1';
UPDATE `hemologica`.`documents_types_codes` SET `documents_type_code_value`='68912' WHERE `id`='2';
INSERT INTO `hemologica`.`documents_types_codes` (`id`, `documents_type_code_label`, `documents_type_code_value`) VALUES ('3', 'label_civic_credential', '68944');
INSERT INTO `documents_types_codes` (`id`,`documents_type_code_label`,`documents_type_code_value`) VALUES (4,'label_other','69024');
INSERT INTO `hemologica`.`documents_types_codes` (`id`, `documents_type_code_label`, `documents_type_code_value`) VALUES ('5', 'label_without_document', '68945');




-- Paises
INSERT INTO `hemologica`.`countries_codes` (`id`, `country_code_label`, `country_code_value`) VALUES ('1', 'label_uruguay', '1');
INSERT INTO `hemologica`.`countries_codes` (`id`, `country_code_label`, `country_code_value`) VALUES ('2', 'label_argentina', '2');
INSERT INTO `hemologica`.`countries_codes` (`id`, `country_code_label`, `country_code_value`) VALUES ('3', 'label_brasil', '3');
INSERT INTO `hemologica`.`countries_codes` (`id`, `country_code_label`, `country_code_value`) VALUES ('4', 'label_chile', '4');
INSERT INTO `hemologica`.`countries_codes` (`id`, `country_code_label`, `country_code_value`) VALUES ('5', 'label_unknown_country', '5');


UPDATE `hemologica`.`countries_codes` SET `country_code_value`='858' WHERE `id`='1';
UPDATE `hemologica`.`countries_codes` SET `country_code_value`='032' WHERE `id`='2';


-- Departamentos
INSERT INTO `hemologica`.`states_codes` (`state_id`, `state_country`, `state_code`, `state_display_name`) VALUES ('1', '1', '1', 'label_montevideo');
INSERT INTO `hemologica`.`states_codes` (`state_id`, `state_country`, `state_code`, `state_display_name`) VALUES ('2', '1', '3', 'label_canelones');
INSERT INTO `hemologica`.`states_codes` (`state_id`, `state_country`, `state_code`, `state_display_name`) VALUES ('3', '1', '3', 'label_maldonado');
INSERT INTO `hemologica`.`states_codes` (`state_id`, `state_country`, `state_code`, `state_display_name`) VALUES ('4', '1', '4', 'label_rocha');
INSERT INTO `hemologica`.`states_codes` (`state_id`, `state_country`, `state_code`, `state_display_name`) VALUES ('5', '2', '5', 'label_buenos_aires');
INSERT INTO `hemologica`.`states_codes` (`state_id`, `state_country`, `state_code`, `state_display_name`) VALUES ('6', '2', '6', 'label_cordoba');

-- Ciudades
INSERT INTO `hemologica`.`cities_codes` (`city_id`, `city_state_id`, `city_code`, `city_display_name`) VALUES ('1', '1', '1', 'label_montevideo');
INSERT INTO `hemologica`.`cities_codes` (`city_id`, `city_state_id`, `city_code`, `city_display_name`) VALUES ('2', '2', '2', 'label_las_piedras');
INSERT INTO `hemologica`.`cities_codes` (`city_id`, `city_state_id`, `city_code`, `city_display_name`) VALUES ('3', '2', '3', 'label_canelones');
INSERT INTO `hemologica`.`cities_codes` (`city_id`, `city_state_id`, `city_code`, `city_display_name`) VALUES ('4', '2', '4', 'label_atlantida');
INSERT INTO `hemologica`.`cities_codes` (`city_id`, `city_state_id`, `city_code`, `city_display_name`) VALUES ('5', '3', '5', 'label_punta_del_este');
INSERT INTO `hemologica`.`cities_codes` (`city_id`, `city_state_id`, `city_code`, `city_display_name`) VALUES ('6', '3', '6', 'label_piriapolis');
INSERT INTO `hemologica`.`cities_codes` (`city_id`, `city_state_id`, `city_code`, `city_display_name`) VALUES ('7', '3', '7', 'label_maldonado');

-- Tipos de rechazo
INSERT INTO `donation_fail_type_codes` (`donation_fail_code_id`,`donation_fail_code_label`,`donation_fail_code_value`,`donation_fail_code_snomed`) VALUES (1,'label_permanent','1',47);
INSERT INTO `donation_fail_type_codes` (`donation_fail_code_id`,`donation_fail_code_label`,`donation_fail_code_value`,`donation_fail_code_snomed`) VALUES (2,'label_temporary','2',48);

--  Severidad 
INSERT INTO `hemologica`.`event_severity_code` (`event_severity_code_id`, `event_severity_code_label`, `event_severity_code_value`, `event_severity_code_snomed`) VALUES ('1', 'event_mild', '1', '42');
INSERT INTO `hemologica`.`event_severity_code` (`event_severity_code_id`, `event_severity_code_label`, `event_severity_code_value`, `event_severity_code_snomed`) VALUES ('2', 'event_moderate', '2', '43');
INSERT INTO `hemologica`.`event_severity_code` (`event_severity_code_id`, `event_severity_code_label`, `event_severity_code_value`, `event_severity_code_snomed`) VALUES ('3', 'event_severe', '3', '44');

-- Resultados
INSERT INTO `hemologica`.`results_code` (`results_code_id`, `boolean_results_code_value`, `results_code_label`, `results_code_value`, `results_code_snomed`) VALUES ('1', 1, 'label_positive', '1', '45');
INSERT INTO `hemologica`.`results_code` (`results_code_id`, `boolean_results_code_value`, `results_code_label`, `results_code_value`, `results_code_snomed`) VALUES ('2', 0, 'label_negative', '2', '46');

-- Genero
INSERT INTO `hemologica`.`gender_code` (`gender_code_id`, `gender_code_label`, `gender_code_value`, `gender_hl7_code`) VALUES ('1', 'label_male', '1', 'M');
INSERT INTO `hemologica`.`gender_code` (`gender_code_id`, `gender_code_label`, `gender_code_value`, `gender_hl7_code`) VALUES ('2', 'label_female', '2', 'F');
INSERT INTO `hemologica`.`gender_code` (`gender_code_id`, `gender_code_label`, `gender_code_value`, `gender_hl7_code`) VALUES ('3', 'label_undefinded', '0', 'UN');

-- Estado de la donacion
INSERT INTO `hemologica`.`donation_state_code` (`donation_state_code_id`, `donation_state_code_label`, `donation_state_code_value`) VALUES ('1', 'donation_state_made', '1');
INSERT INTO `hemologica`.`donation_state_code` (`donation_state_code_id`, `donation_state_code_label`, `donation_state_code_value`) VALUES ('2', 'donation_state_rejected', '2');

UPDATE `hemologica`.`donation_state_code` SET `donation_state_code_value`='completed' WHERE `donation_state_code_id`='1';
UPDATE `hemologica`.`donation_state_code` SET `donation_state_code_value`='cancelled' WHERE `donation_state_code_id`='2';

-- Tipos de donantes
INSERT INTO `hemologica`.`donation_donor_types_codes` (`donation_donor_type_code_id`, `donation_donor_type_code_label`, `donation_donor_type_code_value`) VALUES ('1', 'donor_voluntary', '1');
INSERT INTO `hemologica`.`donation_donor_types_codes` (`donation_donor_type_code_id`, `donation_donor_type_code_label`, `donation_donor_type_code_value`) VALUES ('2', 'donor_replacement', '2');
INSERT INTO `hemologica`.`donation_donor_types_codes` (`donation_donor_type_code_id`, `donation_donor_type_code_label`, `donation_donor_type_code_value`) VALUES ('3', 'donor_other', '3');

INSERT INTO `hemologica`.`donation_fail_causes_codes` (`donation_fail_cause_code_id`, `donation_fail_cause_code_value`, `donation_fail_cause_code_label`, `donation_fail_cause_code_snomed`) VALUES ('4', '4', 'label_low_weight', '50');
INSERT INTO `hemologica`.`donation_fail_causes_codes` (`donation_fail_cause_code_id`, `donation_fail_cause_code_value`, `donation_fail_cause_code_label`, `donation_fail_cause_code_snomed`) VALUES ('5', '5', 'label_low_hemoglobin', '51');
INSERT INTO `hemologica`.`donation_fail_causes_codes` (`donation_fail_cause_code_id`, `donation_fail_cause_code_value`, `donation_fail_cause_code_label`, `donation_fail_cause_code_snomed`) VALUES ('6', '6', 'label_travel', '52');

INSERT INTO `hemologica`.`donation_fail_causes_codes` (`donation_fail_cause_code_id`, `donation_fail_cause_code_value`, `donation_fail_cause_code_label`, `donation_fail_cause_code_snomed`) VALUES ('7', '7', 'label_behavior', '53');


-- Productos --
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('1', 'label_plaquetas', '1', '7');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('2', 'label_crioprecipitado', '2', '8');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('3', 'label_plasma', '3', '9');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('4', 'label_eritrocitos', '4', '10');
INSERT INTO `hemologica`.`units_types` (`unit_type_id`, `unit_type_code_label`, `unit_type_code_value`, `unit_type_code_snomed`) VALUES ('5', 'label_hematies', '5', '54');


INSERT INTO `hemologica`.`donation_laboratoy_codes` (`donation_laboratoy_code_id`, `donation_laboratoy_code_value`, `donation_laboratoy_code_label`, `donation_laboratoy_code_snomed`) VALUES ('4', '4', 'label_analysis_hepatitis_b', '55');


-- Filtro de busqueda de donaciones y tranfusiones
INSERT INTO `hemologica`.`search_filter_codes` (`search_filter_codes_id`, `search_filter_codes_label`, `search_filter_codes_path`, `search_filter_codes_value`) VALUES ('3', 'donation_date', '/ClinicalDocument/effectiveTime/@value', '3');
INSERT INTO `hemologica`.`search_filter_codes` (`search_filter_codes_id`, `search_filter_codes_label`, `search_filter_codes_path`, `search_filter_codes_value`) VALUES ('2', 'donations_result_table_header_document', '/ClinicalDocument/recordTarget/patientRole/patient/id/@root', '2');
INSERT INTO `hemologica`.`search_filter_codes` (`search_filter_codes_id`, `search_filter_codes_label`, `search_filter_codes_path`, `search_filter_codes_value`) VALUES ('4', 'label_bank', '/ClinicalDocument/author/assignedAuthor/representedOrganization/id/@root', '4');
INSERT INTO `hemologica`.`search_filter_codes` (`search_filter_codes_id`, `search_filter_codes_label`, `search_filter_codes_path`, `search_filter_codes_value`) VALUES ('1', 'transfusions_input_search_id', '/ClinicalDocument/id/@extension', '1');
INSERT INTO `hemologica`.`search_filter_codes` (`search_filter_codes_id`, `search_filter_codes_label`, `search_filter_codes_path`, `search_filter_codes_value`) VALUES ('5', 'person_name', '/ClinicalDocument/recordTarget/patientRole/patient/name', '5');

UPDATE `hemologica`.`search_filter_codes` SET `search_filter_codes_path`='/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value' WHERE `search_filter_codes_id`='3';
UPDATE `hemologica`.`search_filter_codes` SET `search_filter_codes_path`='/ClinicalDocument/component/structuredBody/component/section/entry/procedure/id/@extension' WHERE `search_filter_codes_id`='1';


