-- Motivos rechazo
INSERT INTO `hemologica`.`donation_fail_causes_codes` (`donation_fail_cause_code_id`, `donation_fail_cause_code_value`, `donation_fail_cause_code_label`, `donation_fail_cause_code_snomed`) VALUES ('1', '1', 'label_administrative_rejection', '11');
INSERT INTO `hemologica`.`donation_fail_causes_codes` (`donation_fail_cause_code_id`, `donation_fail_cause_code_value`, `donation_fail_cause_code_label`, `donation_fail_cause_code_snomed`) VALUES ('2', '2', 'label_antecedent', '12');
INSERT INTO `hemologica`.`donation_fail_causes_codes` (`donation_fail_cause_code_id`, `donation_fail_cause_code_value`, `donation_fail_cause_code_label`, `donation_fail_cause_code_snomed`) VALUES ('3', '3', 'label_low_pressure', '13');

-- Analisis
INSERT INTO `hemologica`.`donation_laboratoy_codes` (`donation_laboratoy_code_id`, `donation_laboratoy_code_value`, `donation_laboratoy_code_label`, `donation_laboratoy_code_snomed`) VALUES ('1', '1', 'label_analysis_syphilis', '14');
INSERT INTO `hemologica`.`donation_laboratoy_codes` (`donation_laboratoy_code_id`, `donation_laboratoy_code_value`, `donation_laboratoy_code_label`, `donation_laboratoy_code_snomed`) VALUES ('2', '2', 'label_analysis_hepatitis_c', '15');
INSERT INTO `hemologica`.`donation_laboratoy_codes` (`donation_laboratoy_code_id`, `donation_laboratoy_code_value`, `donation_laboratoy_code_label`, `donation_laboratoy_code_snomed`) VALUES ('3', '3', 'label_analysis_vih', '16');

-- Eventos adversos
INSERT INTO `hemologica`.`donation_events_codes` (`donation_event_code_id`, `donation_event_code_value`, `donation_event_code_label`, `donation_event_code_snomed`) VALUES ('1', '1', 'label_dizziness', '17');
INSERT INTO `hemologica`.`donation_events_codes` (`donation_event_code_id`, `donation_event_code_value`, `donation_event_code_label`, `donation_event_code_snomed`) VALUES ('2', '2', 'label_lipothymy', '18');
INSERT INTO `hemologica`.`donation_events_codes` (`donation_event_code_id`, `donation_event_code_value`, `donation_event_code_label`, `donation_event_code_snomed`) VALUES ('3', '3', 'label_convulsion', '19');
INSERT INTO `hemologica`.`donation_events_codes` (`donation_event_code_id`, `donation_event_code_value`, `donation_event_code_label`, `donation_event_code_snomed`) VALUES ('4', '4', 'label_vomiting', '20');
INSERT INTO `hemologica`.`donation_events_codes` (`donation_event_code_id`, `donation_event_code_value`, `donation_event_code_label`, `donation_event_code_snomed`) VALUES ('5', '5', 'label_hematoma', '21');
INSERT INTO `hemologica`.`donation_events_codes` (`donation_event_code_id`, `donation_event_code_value`, `donation_event_code_label`, `donation_event_code_snomed`) VALUES ('6', '6', 'label_cardiac_arrhythmia', '22');

-- Tipos de donacion

INSERT INTO `hemologica`.`donation_types_codes` (`donation_type_code_id`, `donation_type_code_value`, `donation_type_code_label`, `donation_type_code_snomed`) VALUES ('1', '1', 'label_directed', '39');
INSERT INTO `hemologica`.`donation_types_codes` (`donation_type_code_id`, `donation_type_code_value`, `donation_type_code_label`, `donation_type_code_snomed`) VALUES ('2', '2', 'label_autologous', '40');
INSERT INTO `hemologica`.`donation_types_codes` (`donation_type_code_id`, `donation_type_code_value`, `donation_type_code_label`, `donation_type_code_snomed`) VALUES ('3', '3', 'label_common', '41');
INSERT INTO `hemologica`.`donation_types_codes` (`donation_type_code_id`, `donation_type_code_value`, `donation_type_code_label`, `donation_type_code_snomed`) VALUES ('4', '4', 'label_apheresis', '49');


-- Filtros estadisticas

INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`) VALUES ('1', 'label_gender', '/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code', '1');
INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`) VALUES ('2', 'label_age_from', '/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value', '2');
INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`) VALUES ('3', 'label_age_to', '/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value', '3');
INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`) VALUES ('4', 'donation_state_made', '/ClinicalDocument/component/structuredBody/component/section/entry/procedure/statusCode/@code', '4');
INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`) VALUES ('5', 'donation_failed_type', '//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship//observation//value//@code', '5');
INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`) VALUES ('6', 'donation_failed_cause', '/ClinicalDocument/component/structuredBody/component/section/entry/procedure/entryRelationship/observation/code/@code', '6');
INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`) VALUES ('7', 'donation_blood_type', '//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \\\"COMP\\\"]//observation//code/@code', '7');

UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_sql`='select gender_code_value, gender_code_label from gender_code;' WHERE `donation_filter_codes_id`='1';
UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_sql`='select donation_state_code_value, donation_state_code_label from donation_state_code;' WHERE `donation_filter_codes_id`='4';
UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_sql`='select a.donation_fail_code_value, b.concept_code from donation_fail_type_codes as a join concepts as b on a.donation_fail_code_snomed = b.id;' WHERE `donation_filter_codes_id`='5';
UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_sql`='select a.donation_fail_cause_code_value, b.concept_code from donation_fail_causes_codes as a join concepts as b on a.donation_fail_cause_code_snomed = b.id;' WHERE `donation_filter_codes_id`='6';
UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_sql`='select a.blood_type_code_value, b.concept_code from blood_types_codes as a join concepts as b on a.blood_type_code_snomed = b.id;' WHERE `donation_filter_codes_id`='7';

UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_path`='//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \\\"COMP\\\"]//observation//code/@code' WHERE `donation_filter_codes_id`='7';

UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_sql`='select gender_hl7_code, gender_code_label from gender_code;' WHERE `donation_filter_codes_id`='1';

INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`, `donation_filter_codes_sql`) VALUES ('8', 'donation_type', '/ClinicalDocument/component/structuredBody/component/section/code/@code', '8', 'SELECT b.concept_code, a.donation_type_code_label  FROM donation_types_codes as a join  concepts as b where a.donation_type_code_snomed = b.id;');

INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`, `donation_filter_codes_sql`) VALUES ('9', 'label_analysis', '/ClinicalDocument/component/structuredBody/component/section/entry/organizer/component/observation/code/@code', '9', 'SELECT b.concept_code, a.donation_laboratoy_code_label FROM donation_laboratoy_codes as a join concepts as b on a.donation_laboratoy_code_snomed = b.id ;');

SELECT b.concept_code,a.results_code_label FROM hemologica.results_code as a join concepts as b on a.results_code_snomed = b.id;

UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_path`='//ClinicalDocument//component//structuredBody//component//section//entry//component//$1//value/@code' WHERE `donation_filter_codes_id`='10';
UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_sql`='select gender_code_value, gender_code_label from gender_code;' WHERE `donation_filter_codes_id`='1';

INSERT INTO `hemologica`.`donation_filter_codes` (`donation_filter_codes_id`, `donation_filter_codes_label`, `donation_filter_codes_path`, `donation_filter_codes_value`, `donation_filter_codes_sql`) VALUES ('11', 'donor_type', '/ClinicalDocument/component/structuredBody/component/section/entry/observation/code/@code', '11', 'SELECT donation_donor_type_code_value, donation_donor_type_code_label FROM hemologica.donation_donor_types_codes;');

UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_path`='/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship//observation//value//@code' WHERE `donation_filter_codes_id`='5';
UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_path`='/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \'COMP\']//observation//code/@code' WHERE `donation_filter_codes_id`='7';

UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_id`='12' WHERE `donation_filter_codes_id`='1';

UPDATE `hemologica`.`donation_filter_codes` SET `donation_filter_codes_path`='/ClinicalDocument/component/structuredBody/component/section/entry/procedure/code/@code' WHERE `donation_filter_codes_id`='8';

