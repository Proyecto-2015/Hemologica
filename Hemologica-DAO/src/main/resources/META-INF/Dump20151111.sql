CREATE DATABASE  IF NOT EXISTS `hemologica` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `hemologica`;
-- MySQL dump 10.13  Distrib 5.5.46, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: hemologica
-- ------------------------------------------------------
-- Server version	5.5.46-0ubuntu0.14.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `advertisments`
--

DROP TABLE IF EXISTS `advertisments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advertisments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advertisments`
--

LOCK TABLES `advertisments` WRITE;
/*!40000 ALTER TABLE `advertisments` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertisments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `advertisments_contents`
--

DROP TABLE IF EXISTS `advertisments_contents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advertisments_contents` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `advertisments_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_advertisments_contents_advertisments1_idx` (`advertisments_id`),
  CONSTRAINT `fk_advertisments_contents_advertisments1` FOREIGN KEY (`advertisments_id`) REFERENCES `advertisments` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advertisments_contents`
--

LOCK TABLES `advertisments_contents` WRITE;
/*!40000 ALTER TABLE `advertisments_contents` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertisments_contents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_abo_types_codes`
--

DROP TABLE IF EXISTS `blood_abo_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blood_abo_types_codes` (
  `blood_abo_type_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `blood_abo_type_code_value` varchar(45) NOT NULL,
  `blood_abo_type_code_label` varchar(45) NOT NULL,
  `blood_abo_type_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`blood_abo_type_code_id`),
  KEY `fk_blood_abo_types_codes_1_idx` (`blood_abo_type_code_snomed`),
  CONSTRAINT `fk_blood_abo_types_codes_1` FOREIGN KEY (`blood_abo_type_code_snomed`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_abo_types_codes`
--

LOCK TABLES `blood_abo_types_codes` WRITE;
/*!40000 ALTER TABLE `blood_abo_types_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `blood_abo_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_d_types_codes`
--

DROP TABLE IF EXISTS `blood_d_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blood_d_types_codes` (
  `blood_d_type_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `blood_d_type_code_value` varchar(45) NOT NULL,
  `blood_d_type_code_label` varchar(45) NOT NULL,
  `blood_d_type_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`blood_d_type_code_id`),
  KEY `fk_blood_d_types_codes_1_idx` (`blood_d_type_code_snomed`),
  CONSTRAINT `fk_blood_d_types_codes_1` FOREIGN KEY (`blood_d_type_code_snomed`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_d_types_codes`
--

LOCK TABLES `blood_d_types_codes` WRITE;
/*!40000 ALTER TABLE `blood_d_types_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `blood_d_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `centers`
--

DROP TABLE IF EXISTS `centers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `centers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `center_institution_id` int(11) NOT NULL,
  `center_code` varchar(45) NOT NULL,
  `center_display_name` varchar(100) NOT NULL,
  `center_location` bigint(20) DEFAULT NULL,
  `center_oid` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_centers_institutions1_idx` (`center_institution_id`),
  KEY `fk_centers_1_idx` (`center_location`),
  CONSTRAINT `fk_centers_1` FOREIGN KEY (`center_location`) REFERENCES `geo_locations` (`geo_location_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_centers_2` FOREIGN KEY (`center_institution_id`) REFERENCES `institutions` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `centers`
--

LOCK TABLES `centers` WRITE;
/*!40000 ALTER TABLE `centers` DISABLE KEYS */;
/*!40000 ALTER TABLE `centers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cities_codes`
--

DROP TABLE IF EXISTS `cities_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cities_codes` (
  `city_id` bigint(20) NOT NULL,
  `city_state_id` int(11) NOT NULL,
  `city_code` varchar(45) NOT NULL,
  `city_display_name` varchar(45) NOT NULL,
  PRIMARY KEY (`city_id`),
  KEY `fk_cities_codes_1_idx` (`city_state_id`),
  CONSTRAINT `fk_cities_codes_1` FOREIGN KEY (`city_state_id`) REFERENCES `states_codes` (`state_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cities_codes`
--

LOCK TABLES `cities_codes` WRITE;
/*!40000 ALTER TABLE `cities_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `cities_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `concepts`
--

DROP TABLE IF EXISTS `concepts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `concepts` (
  `id` int(11) NOT NULL,
  `concept_code` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concepts`
--

LOCK TABLES `concepts` WRITE;
/*!40000 ALTER TABLE `concepts` DISABLE KEYS */;
/*!40000 ALTER TABLE `concepts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `concepts_displays`
--

DROP TABLE IF EXISTS `concepts_displays`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `concepts_displays` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `concepts_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_concepts_displays_concepts1_idx` (`concepts_id`),
  CONSTRAINT `fk_concepts_displays_concepts1` FOREIGN KEY (`concepts_id`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concepts_displays`
--

LOCK TABLES `concepts_displays` WRITE;
/*!40000 ALTER TABLE `concepts_displays` DISABLE KEYS */;
/*!40000 ALTER TABLE `concepts_displays` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `countries_codes`
--

DROP TABLE IF EXISTS `countries_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `countries_codes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries_codes`
--

LOCK TABLES `countries_codes` WRITE;
/*!40000 ALTER TABLE `countries_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `countries_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documents`
--

DROP TABLE IF EXISTS `documents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documents` (
  `document_id` bigint(20) NOT NULL,
  `document_country` int(11) NOT NULL,
  `document_type` int(11) NOT NULL,
  `document_number` varchar(45) NOT NULL,
  `document_person_id` bigint(20) NOT NULL,
  PRIMARY KEY (`document_id`),
  KEY `fk_documents_1_idx` (`document_country`),
  KEY `fk_documents_2_idx` (`document_type`),
  KEY `fk_documents_3_idx` (`document_person_id`),
  CONSTRAINT `fk_documents_1` FOREIGN KEY (`document_country`) REFERENCES `countries_codes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_documents_2` FOREIGN KEY (`document_type`) REFERENCES `documents_types_codes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_documents_3` FOREIGN KEY (`document_person_id`) REFERENCES `persons` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documents`
--

LOCK TABLES `documents` WRITE;
/*!40000 ALTER TABLE `documents` DISABLE KEYS */;
/*!40000 ALTER TABLE `documents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documents_types_codes`
--

DROP TABLE IF EXISTS `documents_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documents_types_codes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documents_types_codes`
--

LOCK TABLES `documents_types_codes` WRITE;
/*!40000 ALTER TABLE `documents_types_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `documents_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_donor_types_codes`
--

DROP TABLE IF EXISTS `donation_donor_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_donor_types_codes` (
  `donation_donor_type_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `donation_donor_type_code_label` varchar(45) NOT NULL,
  `donation_donor_type_code_value` varchar(45) NOT NULL,
  `donation_donor_type_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`donation_donor_type_code_id`),
  KEY `fk_donation_donor_types_codes_1_idx` (`donation_donor_type_code_snomed`),
  CONSTRAINT `fk_donation_donor_types_codes_1` FOREIGN KEY (`donation_donor_type_code_snomed`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_donor_types_codes`
--

LOCK TABLES `donation_donor_types_codes` WRITE;
/*!40000 ALTER TABLE `donation_donor_types_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `donation_donor_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_events_codes`
--

DROP TABLE IF EXISTS `donation_events_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_events_codes` (
  `donation_event_code_id` int(11) NOT NULL,
  `donation_event_code_value` varchar(45) NOT NULL,
  `donation_event_code_label` varchar(45) NOT NULL,
  `donation_event_code_snomed` int(11) NOT NULL,
  PRIMARY KEY (`donation_event_code_id`),
  KEY `fk_donation_events_codes_1_idx` (`donation_event_code_snomed`),
  CONSTRAINT `fk_donation_events_codes_1` FOREIGN KEY (`donation_event_code_snomed`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_events_codes`
--

LOCK TABLES `donation_events_codes` WRITE;
/*!40000 ALTER TABLE `donation_events_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `donation_events_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_fail_causes_codes`
--

DROP TABLE IF EXISTS `donation_fail_causes_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_fail_causes_codes` (
  `donation_fail_cause_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `donation_fail_cause_code_value` varchar(45) NOT NULL,
  `donation_fail_cause_code_label` varchar(45) NOT NULL,
  PRIMARY KEY (`donation_fail_cause_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_fail_causes_codes`
--

LOCK TABLES `donation_fail_causes_codes` WRITE;
/*!40000 ALTER TABLE `donation_fail_causes_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `donation_fail_causes_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_fail_codes`
--

DROP TABLE IF EXISTS `donation_fail_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_fail_codes` (
  `donation_fail_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `donation_fail_code_value` varchar(45) NOT NULL,
  `donation_fail_code_label` varchar(45) NOT NULL,
  PRIMARY KEY (`donation_fail_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_fail_codes`
--

LOCK TABLES `donation_fail_codes` WRITE;
/*!40000 ALTER TABLE `donation_fail_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `donation_fail_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_laboratoy_codes`
--

DROP TABLE IF EXISTS `donation_laboratoy_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_laboratoy_codes` (
  `donation_laboratoy_code_id` int(11) NOT NULL,
  `donation_laboratoy_code_value` varchar(45) NOT NULL,
  `donation_laboratoy_code_label` varchar(45) NOT NULL,
  `donation_laboratoy_code_snomed` int(11) NOT NULL,
  PRIMARY KEY (`donation_laboratoy_code_id`),
  KEY `fk_donation_laboratoy_codes_1_idx` (`donation_laboratoy_code_snomed`),
  CONSTRAINT `fk_donation_laboratoy_codes_1` FOREIGN KEY (`donation_laboratoy_code_snomed`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_laboratoy_codes`
--

LOCK TABLES `donation_laboratoy_codes` WRITE;
/*!40000 ALTER TABLE `donation_laboratoy_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `donation_laboratoy_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_states_codes`
--

DROP TABLE IF EXISTS `donation_states_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_states_codes` (
  `donation_state_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `donation_state_code_value` varchar(45) NOT NULL,
  `donation_state_code_label` varchar(45) NOT NULL,
  PRIMARY KEY (`donation_state_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_states_codes`
--

LOCK TABLES `donation_states_codes` WRITE;
/*!40000 ALTER TABLE `donation_states_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `donation_states_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_types_codes`
--

DROP TABLE IF EXISTS `donation_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_types_codes` (
  `donation_type_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `donation_type_code_value` varchar(45) NOT NULL,
  `donation_type_code_label` varchar(45) NOT NULL,
  `donation_type_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`donation_type_code_id`),
  KEY `fk_donation_types_codes_1_idx` (`donation_type_code_snomed`),
  CONSTRAINT `fk_donation_types_codes_1` FOREIGN KEY (`donation_type_code_snomed`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_types_codes`
--

LOCK TABLES `donation_types_codes` WRITE;
/*!40000 ALTER TABLE `donation_types_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `donation_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `geo_locations`
--

DROP TABLE IF EXISTS `geo_locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `geo_locations` (
  `geo_location_id` bigint(20) NOT NULL,
  `geo_locations_x` int(20) NOT NULL,
  `geo_locations_y` int(20) NOT NULL,
  PRIMARY KEY (`geo_location_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `geo_locations`
--

LOCK TABLES `geo_locations` WRITE;
/*!40000 ALTER TABLE `geo_locations` DISABLE KEYS */;
/*!40000 ALTER TABLE `geo_locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identifications`
--

DROP TABLE IF EXISTS `identifications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `identifications` (
  `id` int(11) NOT NULL,
  `persons_id` bigint(20) NOT NULL,
  `identificacion_code` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_identifications_persons1_idx` (`persons_id`),
  CONSTRAINT `fk_identifications_persons1` FOREIGN KEY (`persons_id`) REFERENCES `persons` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identifications`
--

LOCK TABLES `identifications` WRITE;
/*!40000 ALTER TABLE `identifications` DISABLE KEYS */;
/*!40000 ALTER TABLE `identifications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identifications_history`
--

DROP TABLE IF EXISTS `identifications_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `identifications_history` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `identification_id` int(11) NOT NULL,
  `identification_code` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_identifications_history_identifications1_idx` (`identification_id`),
  CONSTRAINT `fk_identifications_history_identifications1` FOREIGN KEY (`identification_id`) REFERENCES `identifications` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identifications_history`
--

LOCK TABLES `identifications_history` WRITE;
/*!40000 ALTER TABLE `identifications_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `identifications_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `institutions`
--

DROP TABLE IF EXISTS `institutions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `institutions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `institution_code` varchar(45) NOT NULL,
  `institution_display_name` varchar(45) NOT NULL,
  `institution_oid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `institutions`
--

LOCK TABLES `institutions` WRITE;
/*!40000 ALTER TABLE `institutions` DISABLE KEYS */;
/*!40000 ALTER TABLE `institutions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movements`
--

DROP TABLE IF EXISTS `movements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movements` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `services_id` int(11) NOT NULL,
  `units_id` bigint(20) NOT NULL,
  `movements_types_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_movements_services1_idx` (`services_id`),
  KEY `fk_movements_units1_idx` (`units_id`),
  KEY `fk_movements_movements_types1_idx` (`movements_types_id`),
  CONSTRAINT `fk_movements_movements_types1` FOREIGN KEY (`movements_types_id`) REFERENCES `movements_types` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_movements_services1` FOREIGN KEY (`services_id`) REFERENCES `services` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_movements_units1` FOREIGN KEY (`units_id`) REFERENCES `units` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movements`
--

LOCK TABLES `movements` WRITE;
/*!40000 ALTER TABLE `movements` DISABLE KEYS */;
/*!40000 ALTER TABLE `movements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movements_types`
--

DROP TABLE IF EXISTS `movements_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movements_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movements_types`
--

LOCK TABLES `movements_types` WRITE;
/*!40000 ALTER TABLE `movements_types` DISABLE KEYS */;
/*!40000 ALTER TABLE `movements_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notifications`
--

DROP TABLE IF EXISTS `notifications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notifications` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notifications`
--

LOCK TABLES `notifications` WRITE;
/*!40000 ALTER TABLE `notifications` DISABLE KEYS */;
/*!40000 ALTER TABLE `notifications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notifications_persons`
--

DROP TABLE IF EXISTS `notifications_persons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notifications_persons` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `persons_id` bigint(20) NOT NULL,
  `notifications_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_notifications_persons_persons1_idx` (`persons_id`),
  KEY `fk_notifications_persons_notifications1_idx` (`notifications_id`),
  CONSTRAINT `fk_notifications_persons_notifications1` FOREIGN KEY (`notifications_id`) REFERENCES `notifications` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_notifications_persons_persons1` FOREIGN KEY (`persons_id`) REFERENCES `persons` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notifications_persons`
--

LOCK TABLES `notifications_persons` WRITE;
/*!40000 ALTER TABLE `notifications_persons` DISABLE KEYS */;
/*!40000 ALTER TABLE `notifications_persons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permissions`
--

DROP TABLE IF EXISTS `permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permissions` (
  `id` int(11) NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permissions`
--

LOCK TABLES `permissions` WRITE;
/*!40000 ALTER TABLE `permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persons`
--

DROP TABLE IF EXISTS `persons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persons` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `person_user_id` int(11) NOT NULL,
  `person_first_name` varchar(100) NOT NULL,
  `person_second_name` varchar(100) DEFAULT NULL,
  `person_first_lastname` varchar(100) NOT NULL,
  `person_second_lastname` varchar(45) DEFAULT NULL,
  `person_birthday` date DEFAULT NULL,
  `person_address` varchar(100) DEFAULT NULL,
  `person_telephone` varchar(45) DEFAULT NULL,
  `person_city` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_persons_users1_idx` (`person_user_id`),
  KEY `fk_persons_1_idx` (`person_city`),
  CONSTRAINT `fk_persons_1` FOREIGN KEY (`person_city`) REFERENCES `cities_codes` (`city_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_persons_users1` FOREIGN KEY (`person_user_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persons_records`
--

DROP TABLE IF EXISTS `persons_records`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persons_records` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `identifications_id` int(11) NOT NULL,
  `persons_record_cda_id` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_persons_records_identifications1_idx` (`identifications_id`),
  CONSTRAINT `fk_persons_records_identifications1` FOREIGN KEY (`identifications_id`) REFERENCES `identifications` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons_records`
--

LOCK TABLES `persons_records` WRITE;
/*!40000 ALTER TABLE `persons_records` DISABLE KEYS */;
/*!40000 ALTER TABLE `persons_records` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_permissions`
--

DROP TABLE IF EXISTS `role_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_permissions` (
  `id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  `permissions_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`role_id`,`permissions_id`),
  KEY `fk_role_permissions_role_idx` (`role_id`),
  KEY `fk_role_permissions_permissions1_idx` (`permissions_id`),
  CONSTRAINT `fk_role_permissions_permissions1` FOREIGN KEY (`permissions_id`) REFERENCES `permissions` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_role_permissions_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_permissions`
--

LOCK TABLES `role_permissions` WRITE;
/*!40000 ALTER TABLE `role_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `services`
--

DROP TABLE IF EXISTS `services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `services` (
  `id` int(11) NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `services`
--

LOCK TABLES `services` WRITE;
/*!40000 ALTER TABLE `services` DISABLE KEYS */;
/*!40000 ALTER TABLE `services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `states_codes`
--

DROP TABLE IF EXISTS `states_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `states_codes` (
  `state_id` int(11) NOT NULL,
  `state_country` int(11) NOT NULL,
  `state_code` varchar(45) NOT NULL,
  `state_display_name` varchar(45) NOT NULL,
  PRIMARY KEY (`state_id`),
  KEY `fk_states_codes_1_idx` (`state_country`),
  CONSTRAINT `fk_states_codes_1` FOREIGN KEY (`state_country`) REFERENCES `countries_codes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `states_codes`
--

LOCK TABLES `states_codes` WRITE;
/*!40000 ALTER TABLE `states_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `states_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transfusion_events_codes`
--

DROP TABLE IF EXISTS `transfusion_events_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transfusion_events_codes` (
  `transfusion_event_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `transfusion_event_code_value` varchar(45) NOT NULL,
  `transfusion_event_code_label` varchar(45) NOT NULL,
  `transfusion_event_code_snomed` int(11) NOT NULL,
  PRIMARY KEY (`transfusion_event_code_id`),
  KEY `fk_transfusion_events_codes_1_idx` (`transfusion_event_code_snomed`),
  CONSTRAINT `fk_transfusion_events_codes_1` FOREIGN KEY (`transfusion_event_code_snomed`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfusion_events_codes`
--

LOCK TABLES `transfusion_events_codes` WRITE;
/*!40000 ALTER TABLE `transfusion_events_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `transfusion_events_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transfusion_laboratory_codes`
--

DROP TABLE IF EXISTS `transfusion_laboratory_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transfusion_laboratory_codes` (
  `transfusion_laboratory_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `transfusion_laboratory_code_value` varchar(45) NOT NULL,
  `transfusion_laboratory_code_label` varchar(45) NOT NULL,
  `transfusion_laboratory_code_snomed` int(11) NOT NULL,
  PRIMARY KEY (`transfusion_laboratory_code_id`),
  KEY `fk_transfusion_laboratory_codes_1_idx` (`transfusion_laboratory_code_snomed`),
  CONSTRAINT `fk_transfusion_laboratory_codes_1` FOREIGN KEY (`transfusion_laboratory_code_snomed`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfusion_laboratory_codes`
--

LOCK TABLES `transfusion_laboratory_codes` WRITE;
/*!40000 ALTER TABLE `transfusion_laboratory_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `transfusion_laboratory_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `units`
--

DROP TABLE IF EXISTS `units`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `units` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `unit_uuid` varchar(45) NOT NULL,
  `unit_institution_id` int(11) NOT NULL,
  `unit_institution_center_id` int(11) DEFAULT NULL,
  `unit_type` int(11) NOT NULL,
  `unit_institution_code` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_units_1_idx` (`unit_institution_id`),
  KEY `fk_units_2_idx` (`unit_institution_center_id`),
  KEY `fk_units_3_idx` (`unit_type`),
  CONSTRAINT `fk_units_1` FOREIGN KEY (`unit_institution_id`) REFERENCES `institutions` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_units_2` FOREIGN KEY (`unit_institution_center_id`) REFERENCES `centers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_units_3` FOREIGN KEY (`unit_type`) REFERENCES `units_types` (`unit_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `units`
--

LOCK TABLES `units` WRITE;
/*!40000 ALTER TABLE `units` DISABLE KEYS */;
/*!40000 ALTER TABLE `units` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `units_types`
--

DROP TABLE IF EXISTS `units_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `units_types` (
  `unit_type_id` int(11) NOT NULL,
  `unit_type_code` varchar(45) NOT NULL,
  `unit_type_display` varchar(45) NOT NULL,
  PRIMARY KEY (`unit_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `units_types`
--

LOCK TABLES `units_types` WRITE;
/*!40000 ALTER TABLE `units_types` DISABLE KEYS */;
/*!40000 ALTER TABLE `units_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_role_services`
--

DROP TABLE IF EXISTS `users_role_services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_role_services` (
  `users_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  `services_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  PRIMARY KEY (`users_id`,`role_id`,`services_id`,`id`),
  KEY `fk_users_role_services_role1_idx` (`role_id`),
  KEY `fk_users_role_services_services1_idx` (`services_id`),
  CONSTRAINT `fk_users_role_services_role1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_users_role_services_services1` FOREIGN KEY (`services_id`) REFERENCES `services` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_users_role_services_users1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_role_services`
--

LOCK TABLES `users_role_services` WRITE;
/*!40000 ALTER TABLE `users_role_services` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_role_services` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-11 19:03:24
