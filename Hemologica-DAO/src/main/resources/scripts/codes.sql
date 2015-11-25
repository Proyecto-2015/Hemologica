-- Mensajes habilitodos - todos
INSERT INTO `hemologica`.`message_send_Option` (`id`, `label`) VALUES ('1', 'label_all');
INSERT INTO `hemologica`.`message_send_Option` (`id`, `label`) VALUES ('2', 'label_enable');

-- Tipos de Documentos
INSERT INTO `hemologica`.`documents_types_codes` (`id`, `documents_type_code_label`, `documents_type_code_value`) VALUES ('1', 'label_cedula', '1');
INSERT INTO `hemologica`.`documents_types_codes` (`id`, `documents_type_code_label`, `documents_type_code_value`) VALUES ('2', 'label_passport', '2');

-- Paises
INSERT INTO `hemologica`.`countries_codes` (`id`, `country_code_label`, `country_code_value`) VALUES ('1', 'label_uruguay', '1');
INSERT INTO `hemologica`.`countries_codes` (`id`, `country_code_label`, `country_code_value`) VALUES ('2', 'label_argentina', '2');
INSERT INTO `hemologica`.`countries_codes` (`id`, `country_code_label`, `country_code_value`) VALUES ('3', 'label_brasil', '3');
INSERT INTO `hemologica`.`countries_codes` (`id`, `country_code_label`, `country_code_value`) VALUES ('4', 'label_chile', '4');

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
INSERT INTO `hemologica`.`donation_fail_type_codes` (`donation_fail_code_id`, `donation_fail_code_label`, `donation_fail_code_value`) VALUES ('1', 'label_permanent', '1');
INSERT INTO `hemologica`.`donation_fail_type_codes` (`donation_fail_code_id`, `donation_fail_code_label`, `donation_fail_code_value`) VALUES ('2', 'label_temporary', '2');


