-- Analisis

INSERT INTO `hemologica`.`transfusion_laboratory_codes` (`transfusion_laboratory_code_id`, `transfusion_laboratory_code_value`, `transfusion_laboratory_code_label`, `transfusion_laboratory_code_snomed`) VALUES ('1', '1', 'label_direct_coombs ', '23');
INSERT INTO `hemologica`.`transfusion_laboratory_codes` (`transfusion_laboratory_code_id`, `transfusion_laboratory_code_value`, `transfusion_laboratory_code_label`, `transfusion_laboratory_code_snomed`) VALUES ('2', '2', 'label_indirect_coombs ', '24');

-- Evento adversos

INSERT INTO `hemologica`.`transfusion_events_codes` (`transfusion_event_code_id`, `transfusion_event_code_value`, `transfusion_event_code_label`, `transfusion_event_code_snomed`) VALUES ('1', '1', 'label_viral_hepatitis', '25');
INSERT INTO `hemologica`.`transfusion_events_codes` (`transfusion_event_code_id`, `transfusion_event_code_value`, `transfusion_event_code_label`, `transfusion_event_code_snomed`) VALUES ('2', '2', 'label_transfusional_hemosiderosis', '26');
INSERT INTO `hemologica`.`transfusion_events_codes` (`transfusion_event_code_id`, `transfusion_event_code_value`, `transfusion_event_code_label`, `transfusion_event_code_snomed`) VALUES ('3', '3', 'label_abo_incompatibility_reaction', '27');
INSERT INTO `hemologica`.`transfusion_events_codes` (`transfusion_event_code_id`, `transfusion_event_code_value`, `transfusion_event_code_label`, `transfusion_event_code_snomed`) VALUES ('4', '4', 'label_rh_incompatibility_reaction', '28');
INSERT INTO `hemologica`.`transfusion_events_codes` (`transfusion_event_code_id`, `transfusion_event_code_value`, `transfusion_event_code_label`, `transfusion_event_code_snomed`) VALUES ('5', '5', 'label_febrile_reaction', '29');
INSERT INTO `hemologica`.`transfusion_events_codes` (`transfusion_event_code_id`, `transfusion_event_code_value`, `transfusion_event_code_label`, `transfusion_event_code_snomed`) VALUES ('6', '6', 'label_allergic_reaction', '30');

-- Filtros estadisticas

INSERT INTO `hemologica`.`transfusion_filter_codes` (`transfusion_filter_codes_id`, `transfusion_filter_codes_label`, `transfusion_filter_codes_path`, `transfusion_filter_codes_sql`, `transfusion_filter_codes_value`) VALUES ('1', 'label_product', '//ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//@code', 'select b.concept_code , a.unit_type_code_label from units_types as a join concepts as b on a.unit_type_code_snomed = b.id;', '1');
INSERT INTO `hemologica`.`transfusion_filter_codes` (`transfusion_filter_codes_id`, `transfusion_filter_codes_label`, `transfusion_filter_codes_path`, `transfusion_filter_codes_value`) VALUES ('2', 'label_age_from', '/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value', '2');
INSERT INTO `hemologica`.`transfusion_filter_codes` (`transfusion_filter_codes_id`, `transfusion_filter_codes_label`, `transfusion_filter_codes_path`, `transfusion_filter_codes_value`) VALUES ('3', 'label_age_to', '/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value', '3');
INSERT INTO `hemologica`.`transfusion_filter_codes` (`transfusion_filter_codes_id`, `transfusion_filter_codes_label`, `transfusion_filter_codes_path`, `transfusion_filter_codes_sql`, `transfusion_filter_codes_value`) VALUES ('4', 'label_gender', '/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code', 'select gender_hl7_code, gender_code_label from gender_code;', '4');
INSERT INTO `hemologica`.`transfusion_filter_codes` (`transfusion_filter_codes_id`, `transfusion_filter_codes_label`, `transfusion_filter_codes_path`, `transfusion_filter_codes_sql`, `transfusion_filter_codes_value`) VALUES ('5', 'label_adverse_events', '/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/code/@code', 'select b.concept_code , a.transfusion_event_code_label from transfusion_events_codes as a join concepts as b on a.transfusion_event_code_snomed = b.id;', '5');
INSERT INTO `hemologica`.`transfusion_filter_codes` (`transfusion_filter_codes_id`, `transfusion_filter_codes_label`, `transfusion_filter_codes_path`, `transfusion_filter_codes_sql`, `transfusion_filter_codes_value`) VALUES ('6', 'label_severity', '/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/interpretationCode/@code', 'select b.concept_code , a.event_severity_code_label from event_severity_code as a join concepts as b on a.event_severity_code_snomed = b.id;', '6');

UPDATE `hemologica`.`transfusion_filter_codes` SET `transfusion_filter_codes_path`='/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/$1/interpretationCode/@code' WHERE `transfusion_filter_codes_id`='6';
UPDATE `hemologica`.`transfusion_filter_codes` SET `transfusion_filter_codes_path`='//ClinicalDocument//component//structuredBody//component//section//entry//observation//$1//interpretationCode//@code' WHERE `transfusion_filter_codes_id`='6';

UPDATE `hemologica`.`transfusion_filter_codes` SET `transfusion_filter_codes_sql`='select gender_code_value, gender_code_label from gender_code;' WHERE `transfusion_filter_codes_id`='4';


UPDATE `hemologica`.`transfusion_filter_codes` SET `transfusion_filter_codes_path`='/ClinicalDocument//component//structuredBody//component//section//entry//observation//$1//interpretationCode//@code' WHERE `transfusion_filter_codes_id`='6';
UPDATE `hemologica`.`transfusion_filter_codes` SET `transfusion_filter_codes_path`='/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//@code' WHERE `transfusion_filter_codes_id`='1';

UPDATE `hemologica`.`transfusion_filter_codes` SET `transfusion_filter_codes_id`='7' WHERE `transfusion_filter_codes_id`='1';
