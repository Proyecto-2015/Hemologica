insert into `hemologica`.`movements_types` (`id`, `movement_type_code`, `type`) values
('1', '1', '1'),
('2', '2', '0');

insert into `hemologica`.`units` (`id`,`unit_institution_code`,`unit_uuid`,`unit_institution_center_id`,`unit_type`,`unit_state`,`unit_parent`,`blood_abo_type`,`blood_rh_type`) values
('4', '1000000', '6e973e21-3ff2-4832-9ea6-0f24587be57c', '1', '4', '1', NULL, '4', '2'),
('5', '10000001', '2839835f-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('6', '10000002', '283986b6-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('7', '10000003', '2839876f-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('8', '10000004', '28398804-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('9', '10000005', '2839889a-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('10', '10000006', '7ceef088-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('11', '10000007', '7ceef2ea-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('12', '10000008', '7ceef399-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('13', '10000009', '7ceef42c-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('14', '10000010', '7ceef4b4-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('15', '10000011', '7ceef53a-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('16', '10000012', '7ceef5c8-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('17', '10000013', '7ceef653-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('18', '10000014', '7ceef6d9-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('19', '10000015', '7ceef764-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('20', '10000016', '7ceef7ef-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('21', '10000017', '7ceef877-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('22', '10000018', '7ceef90d-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2'),
('23', '10000019', '7ceef994-a0d7-11e5-97fa-208984bbdd79', '1', '4', '1', NULL, '4', '2');


insert into `hemologica`.`movements` (`id`,`movement_date`,`movement_center`,`movements_types_id`,`units_id`) values
('4', '2015-12-10 00:00:00', '1', '1', '4'),
('5', '2015-12-12 11:05:39', '1', '1', '5'),
('6', '2015-12-12 11:05:39', '1', '1', '6'),
('7', '2015-12-12 11:05:39', '1', '1', '7'),
('8', '2015-12-12 11:05:39', '1', '1', '8'),
('9', '2015-12-12 11:05:39', '1', '1', '9'),
('10', '2015-12-12 11:05:39', '1', '1', '10'),
('11', '2015-12-12 11:05:39', '1', '1', '11'),
('12', '2015-12-12 11:05:39', '1', '1', '12'),
('13', '2015-12-12 11:05:39', '1', '1', '13'),
('14', '2015-12-12 11:05:39', '1', '1', '14'),
('15', '2015-12-12 11:05:39', '1', '1', '15'),
('16', '2015-12-12 11:05:39', '1', '1', '17'),
('17', '2015-12-12 11:05:39', '1', '1', '18'),
('18', '2015-12-12 11:05:39', '1', '1', '19'),
('19', '2015-12-12 11:06:18', '1', '2', '5'),
('20', '2015-12-12 11:06:18', '1', '2', '6'),
('21', '2015-12-12 11:06:18', '1', '2', '7'),
('22', '2015-12-12 11:06:18', '1', '2', '8'),
('23', '2015-12-12 11:06:18', '1', '2', '9'),
('24', '2015-12-12 11:06:18', '1', '2', '10'),
('25', '2015-12-12 11:06:18', '1', '2', '11'),
('26', '2015-12-12 11:06:18', '1', '2', '12'),
('27', '2015-12-12 11:06:18', '1', '2', '13'),
('28', '2015-12-12 11:06:18', '1', '2', '14'),
('29', '2015-12-12 11:06:18', '1', '2', '15'),
('30', '2015-12-12 11:06:18', '1', '2', '17'),
('31', '2015-12-12 11:06:18', '1', '2', '18'),
('32', '2015-12-12 11:06:18', '1', '2', '19');




