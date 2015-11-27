
-- Responsables de Transfusion
INSERT INTO `hemologica`.`persons` (`id`, `person_first_name`, `person_first_lastname`, `person_second_lastname`, `person_address`, `person_telephone`, `person_city`) VALUES ('1', 'Paula', 'Roche', 'De Polsi', 'Rivera 2711', '099358717', '1');
INSERT INTO `hemologica`.`persons` (`id`, `person_first_name`, `person_second_name`, `person_first_lastname`, `person_second_lastname`, `person_address`, `person_telephone`, `person_city`) VALUES ('2', 'Bruno', 'Guillermo', 'Strasser', 'Mazza', 'Gonzalo Ramirez 678', '099567345', '1');

UPDATE `hemologica`.`persons` SET `person_allow_notification_able`=1, `person_allow_notification_need_donor`=1 WHERE `id`='1';
UPDATE `hemologica`.`persons` SET `person_allow_notification_able`=0, `person_allow_notification_need_donor`=0 WHERE `id`='2';


INSERT INTO `hemologica`.`documents` (`document_id`, `document_country`, `document_type`, `document_number`, `document_person_id`) VALUES ('1', '1', '1', '46714299', '1');
INSERT INTO `hemologica`.`documents` (`document_id`, `document_country`, `document_type`, `document_number`, `document_person_id`) VALUES ('2', '1', '1', '35679873', '2');

-- Identificaciones --
INSERT INTO `hemologica`.`identifications` (`id`, `persons_id`, `identificacion_code`) VALUES ('1', '1', '1');
INSERT INTO `hemologica`.`identifications` (`id`, `persons_id`, `identificacion_code`) VALUES ('2', '2', '2');

-- Link a un CDA --
INSERT INTO `hemologica`.`persons_records` (`id`, `identifications_id`, `persons_record_cda_extension`, `persons_record_cda_root`) VALUES ('1', '1', '2.16.858.0.0.1.10.2.3.1.1.1', '2');


INSERT INTO `hemologica`.`responsible_transfusion_person` (`id`, `person_center`, `person`) VALUES ('1', '4', '1');
INSERT INTO `hemologica`.`responsible_transfusion_person` (`id`, `person_center`, `person`) VALUES ('2', '4', '2');
