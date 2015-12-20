DROP DATABASE `hemologica`;
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
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `advertisment_date` date DEFAULT NULL,
  `advertisment_subtitle` varchar(255) DEFAULT NULL,
  `advertisment_summary` longtext,
  `advertisment_text` longtext,
  `advertisment_title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advertisments`
--

LOCK TABLES `advertisments` WRITE;
/*!40000 ALTER TABLE `advertisments` DISABLE KEYS */;
INSERT INTO `advertisments` VALUES (1,'2015-11-05','Sub Titulo 1','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 1','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.','Titulo 1'),(2,'2015-06-05','Sub Titulo 2','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 2','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 2','Titulo 2'),(3,'2014-04-05','Sub Titulo 3','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 3','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 3','Titulo 3'),(4,'2014-03-05','Sub Titulo 4','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 4','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 4','Titulo 4'),(5,'2014-01-03','Sub Titulo 5','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 5','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 5','Titulo 5'),(6,'2014-01-15','Sub Titulo 6','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 6','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 6','Titulo 6');
/*!40000 ALTER TABLE `advertisments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `advertisments_contents`
--

DROP TABLE IF EXISTS `advertisments_contents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advertisments_contents` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `advertisments_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_po8umkf7p9jhot8m375ofk6al` (`advertisments_id`),
  CONSTRAINT `FK_po8umkf7p9jhot8m375ofk6al` FOREIGN KEY (`advertisments_id`) REFERENCES `advertisments` (`id`)
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
  `blood_abo_type_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blood_abo_type_code_label` varchar(255) DEFAULT NULL,
  `blood_abo_type_code_value` varchar(255) DEFAULT NULL,
  `blood_abo_type_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`blood_abo_type_code_id`),
  KEY `FK_4rv23fagevkfncoruj4df9q6m` (`blood_abo_type_code_snomed`),
  CONSTRAINT `FK_4rv23fagevkfncoruj4df9q6m` FOREIGN KEY (`blood_abo_type_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_abo_types_codes`
--

LOCK TABLES `blood_abo_types_codes` WRITE;
/*!40000 ALTER TABLE `blood_abo_types_codes` DISABLE KEYS */;
INSERT INTO `blood_abo_types_codes` VALUES (1,'A','1',1),(2,'AB','2',2),(3,'B','3',3),(4,'O','4',4);
/*!40000 ALTER TABLE `blood_abo_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_d_types_codes`
--

DROP TABLE IF EXISTS `blood_d_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blood_d_types_codes` (
  `blood_d_type_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blood_d_type_code_label` varchar(255) DEFAULT NULL,
  `blood_d_type_code_value` varchar(255) DEFAULT NULL,
  `blood_d_type_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`blood_d_type_code_id`),
  KEY `FK_fpekbbeby29npqrhydq2sqlki` (`blood_d_type_code_snomed`),
  CONSTRAINT `FK_fpekbbeby29npqrhydq2sqlki` FOREIGN KEY (`blood_d_type_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_d_types_codes`
--

LOCK TABLES `blood_d_types_codes` WRITE;
/*!40000 ALTER TABLE `blood_d_types_codes` DISABLE KEYS */;
INSERT INTO `blood_d_types_codes` VALUES (1,'RH+','1',6),(2,'RH-','2',5);
/*!40000 ALTER TABLE `blood_d_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_types_codes`
--

DROP TABLE IF EXISTS `blood_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blood_types_codes` (
  `blood_type_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `blood_type_code_label` varchar(255) DEFAULT NULL,
  `blood_type_code_value` varchar(255) DEFAULT NULL,
  `blood_abo_type_code_snomed` bigint(20) DEFAULT NULL,
  `blood_rh_type_code_snomed` bigint(20) DEFAULT NULL,
  `blood_type_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`blood_type_code_id`),
  KEY `FK_jjes06hlauvahxhvinegln0mf` (`blood_abo_type_code_snomed`),
  KEY `FK_iga3i2b6f54x8ygtas7tccaf2` (`blood_rh_type_code_snomed`),
  KEY `FK_elt7cyxnqs67ipp0q7ccty6fv` (`blood_type_code_snomed`),
  CONSTRAINT `FK_elt7cyxnqs67ipp0q7ccty6fv` FOREIGN KEY (`blood_type_code_snomed`) REFERENCES `concepts` (`id`),
  CONSTRAINT `FK_iga3i2b6f54x8ygtas7tccaf2` FOREIGN KEY (`blood_rh_type_code_snomed`) REFERENCES `blood_d_types_codes` (`blood_d_type_code_id`),
  CONSTRAINT `FK_jjes06hlauvahxhvinegln0mf` FOREIGN KEY (`blood_abo_type_code_snomed`) REFERENCES `blood_abo_types_codes` (`blood_abo_type_code_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_types_codes`
--

LOCK TABLES `blood_types_codes` WRITE;
/*!40000 ALTER TABLE `blood_types_codes` DISABLE KEYS */;
INSERT INTO `blood_types_codes` VALUES (1,'label_orh-','1',4,2,31),(2,'label_orh+','2',4,1,32),(3,'label_arh-','3',1,2,33),(4,'label_arh+','4',1,1,34),(5,'label_abrh-','5',2,2,35),(6,'label_abh+','6',2,1,36),(7,'label_brh-','7',3,2,37),(8,'label_brh+','8',3,1,38);
/*!40000 ALTER TABLE `blood_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `centers`
--

DROP TABLE IF EXISTS `centers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `centers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `center_address` varchar(255) DEFAULT NULL,
  `center_code` varchar(255) DEFAULT NULL,
  `center_display_name` varchar(255) DEFAULT NULL,
  `center_email` varchar(255) DEFAULT NULL,
  `center_hour` varchar(255) DEFAULT NULL,
  `center_information` varchar(255) DEFAULT NULL,
  `center_oid` varchar(255) DEFAULT NULL,
  `center_telephone` varchar(255) DEFAULT NULL,
  `center_type` int(11) DEFAULT NULL,
  `center_location` bigint(20) DEFAULT NULL,
  `center_institution_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_aaj1bh42h00xcopiqmrlriqpv` (`center_location`),
  KEY `FK_4qyiauiegvvn94u6j51hpq9bk` (`center_institution_id`),
  CONSTRAINT `FK_4qyiauiegvvn94u6j51hpq9bk` FOREIGN KEY (`center_institution_id`) REFERENCES `institutions` (`id`),
  CONSTRAINT `FK_aaj1bh42h00xcopiqmrlriqpv` FOREIGN KEY (`center_location`) REFERENCES `geo_locations` (`geo_location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `centers`
--

LOCK TABLES `centers` WRITE;
/*!40000 ALTER TABLE `centers` DISABLE KEYS */;
INSERT INTO `centers` VALUES (1,'Av Italia 345','345','Banco de Sangre 1','infobanco1@hc.com','Lunes a viernes de 8 - 18 hs ','Se dan 40 numeros a partir de las 8 am.','987658','12345678',0,1,1),(2,'Rivera 567','346','Banco de Sangre 2','infobanco2@hc.com','Lunes a viernes de 8 - 20 hs y Sabados 8 - 12 ','Pedir hora por telefono','654789','098765432',0,2,2),(3,'Melilla 7356','347','Banco de Sangre 3','infobanco3@hc.com','Lunes a jueves de 8 - 20 hs y Sabados 8 - 12 ','Pedir hora por la pagina web bancoDesangre3.org.uy','356789','098765432',0,3,2),(4,NULL,'348','Centro Transfusional 1',NULL,NULL,NULL,'098755',NULL,1,NULL,1),(5,NULL,'349','Centro Transfusional 2',NULL,NULL,NULL,'567876',NULL,1,NULL,2);
/*!40000 ALTER TABLE `centers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cities_codes`
--

DROP TABLE IF EXISTS `cities_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cities_codes` (
  `city_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `city_code` varchar(255) DEFAULT NULL,
  `city_display_name` varchar(255) DEFAULT NULL,
  `city_state_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`city_id`),
  KEY `FK_gn18uvbp14sg0etsnxfu5q6c9` (`city_state_id`),
  CONSTRAINT `FK_gn18uvbp14sg0etsnxfu5q6c9` FOREIGN KEY (`city_state_id`) REFERENCES `states_codes` (`state_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cities_codes`
--

LOCK TABLES `cities_codes` WRITE;
/*!40000 ALTER TABLE `cities_codes` DISABLE KEYS */;
INSERT INTO `cities_codes` VALUES (1,'1','label_montevideo',1),(2,'2','label_las_piedras',2),(3,'3','label_canelones',2),(4,'4','label_atlantida',2),(5,'5','label_punta_del_este',3),(6,'6','label_piriapolis',3),(7,'7','label_maldonado',3);
/*!40000 ALTER TABLE `cities_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `concepts`
--

DROP TABLE IF EXISTS `concepts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `concepts` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `concept_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concepts`
--

LOCK TABLES `concepts` WRITE;
/*!40000 ALTER TABLE `concepts` DISABLE KEYS */;
INSERT INTO `concepts` VALUES (1,'112144000'),(2,'165743006'),(3,'112149005'),(4,'58460004'),(5,'165746003'),(6,'165747007'),(7,'256395009'),(8,'256401009'),(9,'256400005'),(10,'126242007'),(11,'22370005'),(12,'161462004'),(13,'12763006'),(14,'40675008'),(15,'413107006'),(16,'31676001'),(17,'404640003'),(18,'248228001'),(19,'91175000'),(20,'422400008'),(21,'385494008'),(22,'698247007'),(23,'77020008'),(24,'16742006'),(25,'73301000'),(26,'69281008'),(27,'341009'),(28,'88924008'),(29,'73301000'),(30,'361098001'),(31,'278148006'),(32,'278147001'),(33,'278152006'),(34,'278149003'),(35,'278154007'),(36,'278151004'),(37,'278153001'),(38,'278150003'),(39,'1788001'),(40,'42736004'),(41,'233555005'),(42,'255604002'),(43,'6736007'),(44,'24484000'),(45,'10828004'),(46,'260385009'),(47,'6934004'),(48,'14803004'),(49,'127788007'),(50,'248342006'),(51,'165397008'),(52,'365457007'),(53,'844005'),(54,'119351004'),(55,'171122006');
/*!40000 ALTER TABLE `concepts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `concepts_displays`
--

DROP TABLE IF EXISTS `concepts_displays`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `concepts_displays` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `concepts_label` varchar(255) DEFAULT NULL,
  `concepts_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_rf98jarj6pastk2nqcyukt6s2` (`concepts_id`),
  CONSTRAINT `FK_rf98jarj6pastk2nqcyukt6s2` FOREIGN KEY (`concepts_id`) REFERENCES `concepts` (`id`)
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
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `country_code_label` varchar(255) DEFAULT NULL,
  `country_code_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries_codes`
--

LOCK TABLES `countries_codes` WRITE;
/*!40000 ALTER TABLE `countries_codes` DISABLE KEYS */;
INSERT INTO `countries_codes` VALUES (1,'label_uruguay','858'),(2,'label_argentina','032'),(3,'label_brasil','3'),(4,'label_chile','4');
/*!40000 ALTER TABLE `countries_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documents`
--

DROP TABLE IF EXISTS `documents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documents` (
  `document_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `document_number` varchar(255) DEFAULT NULL,
  `document_country` bigint(20) DEFAULT NULL,
  `document_type` bigint(20) DEFAULT NULL,
  `document_person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`document_id`),
  KEY `FK_ikbefaduw7p8tx8r9r9x63d8g` (`document_country`),
  KEY `FK_73ach9x1ky5bf1649fk15x4a4` (`document_type`),
  KEY `FK_tjk3hujgi78i05kbhqa75t8wx` (`document_person_id`),
  CONSTRAINT `FK_tjk3hujgi78i05kbhqa75t8wx` FOREIGN KEY (`document_person_id`) REFERENCES `persons` (`id`),
  CONSTRAINT `FK_73ach9x1ky5bf1649fk15x4a4` FOREIGN KEY (`document_type`) REFERENCES `documents_types_codes` (`id`),
  CONSTRAINT `FK_ikbefaduw7p8tx8r9r9x63d8g` FOREIGN KEY (`document_country`) REFERENCES `countries_codes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documents`
--

LOCK TABLES `documents` WRITE;
/*!40000 ALTER TABLE `documents` DISABLE KEYS */;
INSERT INTO `documents` VALUES (1,'46714299',1,1,1),(2,'35679873',1,1,2);
/*!40000 ALTER TABLE `documents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documents_types_codes`
--

DROP TABLE IF EXISTS `documents_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documents_types_codes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `documents_type_code_label` varchar(255) DEFAULT NULL,
  `documents_type_code_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documents_types_codes`
--

LOCK TABLES `documents_types_codes` WRITE;
/*!40000 ALTER TABLE `documents_types_codes` DISABLE KEYS */;
INSERT INTO `documents_types_codes` VALUES (1,'label_cedula','68909'),(2,'label_passport','68912'),(3,'label_civic_credential','68944'),(4,'label_other','69024'),(5,'label_without_document','68945');
/*!40000 ALTER TABLE `documents_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_donor_types_codes`
--

DROP TABLE IF EXISTS `donation_donor_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_donor_types_codes` (
  `donation_donor_type_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `donation_donor_type_code_label` varchar(255) DEFAULT NULL,
  `donation_donor_type_code_value` varchar(255) DEFAULT NULL,
  `donation_donor_type_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`donation_donor_type_code_id`),
  KEY `FK_t4rt4gv3np4jbpw6yi644pnhu` (`donation_donor_type_code_snomed`),
  CONSTRAINT `FK_t4rt4gv3np4jbpw6yi644pnhu` FOREIGN KEY (`donation_donor_type_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_donor_types_codes`
--

LOCK TABLES `donation_donor_types_codes` WRITE;
/*!40000 ALTER TABLE `donation_donor_types_codes` DISABLE KEYS */;
INSERT INTO `donation_donor_types_codes` VALUES (1,'donor_voluntary','1',NULL),(2,'donor_replacement','2',NULL),(3,'donor_other','3',NULL);
/*!40000 ALTER TABLE `donation_donor_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_events_codes`
--

DROP TABLE IF EXISTS `donation_events_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_events_codes` (
  `donation_event_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `donation_event_code_label` varchar(255) DEFAULT NULL,
  `donation_event_code_value` varchar(255) DEFAULT NULL,
  `donation_event_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`donation_event_code_id`),
  KEY `FK_h2t14rejfh74wpld4811wxffc` (`donation_event_code_snomed`),
  CONSTRAINT `FK_h2t14rejfh74wpld4811wxffc` FOREIGN KEY (`donation_event_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_events_codes`
--

LOCK TABLES `donation_events_codes` WRITE;
/*!40000 ALTER TABLE `donation_events_codes` DISABLE KEYS */;
INSERT INTO `donation_events_codes` VALUES (1,'label_dizziness','1',17),(2,'label_lipothymy','2',18),(3,'label_convulsion','3',19),(4,'label_vomiting','4',20),(5,'label_hematoma','5',21),(6,'label_cardiac_arrhythmia','6',22);
/*!40000 ALTER TABLE `donation_events_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_fail_causes_codes`
--

DROP TABLE IF EXISTS `donation_fail_causes_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_fail_causes_codes` (
  `donation_fail_cause_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `donation_fail_cause_code_label` varchar(255) DEFAULT NULL,
  `donation_fail_cause_code_value` varchar(255) DEFAULT NULL,
  `donation_fail_cause_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`donation_fail_cause_code_id`),
  KEY `FK_71dvr1sx0rr64mbarv380ttfp` (`donation_fail_cause_code_snomed`),
  CONSTRAINT `FK_71dvr1sx0rr64mbarv380ttfp` FOREIGN KEY (`donation_fail_cause_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_fail_causes_codes`
--

LOCK TABLES `donation_fail_causes_codes` WRITE;
/*!40000 ALTER TABLE `donation_fail_causes_codes` DISABLE KEYS */;
INSERT INTO `donation_fail_causes_codes` VALUES (1,'label_administrative_rejection','1',11),(2,'label_antecedent','2',12),(3,'label_low_pressure','3',13),(4,'label_low_weight','4',50),(5,'label_low_hemoglobin','5',51),(6,'label_travel','6',52),(7,'label_behavior','7',53);
/*!40000 ALTER TABLE `donation_fail_causes_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_fail_type_codes`
--

DROP TABLE IF EXISTS `donation_fail_type_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_fail_type_codes` (
  `donation_fail_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `donation_fail_code_label` varchar(255) DEFAULT NULL,
  `donation_fail_code_value` varchar(255) DEFAULT NULL,
  `donation_fail_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`donation_fail_code_id`),
  KEY `FK_fm1gejnnnvtar0w21wq0qvd30` (`donation_fail_code_snomed`),
  CONSTRAINT `FK_fm1gejnnnvtar0w21wq0qvd30` FOREIGN KEY (`donation_fail_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_fail_type_codes`
--

LOCK TABLES `donation_fail_type_codes` WRITE;
/*!40000 ALTER TABLE `donation_fail_type_codes` DISABLE KEYS */;
INSERT INTO `donation_fail_type_codes` VALUES (1,'label_permanent','1',47),(2,'label_temporary','2',48);
/*!40000 ALTER TABLE `donation_fail_type_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_filter_codes`
--

DROP TABLE IF EXISTS `donation_filter_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_filter_codes` (
  `donation_filter_codes_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `donation_filter_codes_label` varchar(255) DEFAULT NULL,
  `donation_filter_codes_path` varchar(255) DEFAULT NULL,
  `donation_filter_codes_sql` varchar(255) DEFAULT NULL,
  `donation_filter_codes_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`donation_filter_codes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_filter_codes`
--

LOCK TABLES `donation_filter_codes` WRITE;
/*!40000 ALTER TABLE `donation_filter_codes` DISABLE KEYS */;
INSERT INTO `donation_filter_codes` VALUES (1,'label_gender','/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code','select gender_code_value, gender_code_label from gender_code;','1'),(2,'label_age_from','/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value',NULL,'2'),(3,'label_age_to','/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value',NULL,'3'),(4,'donation_state_made','/ClinicalDocument/component/structuredBody/component/section/entry/procedure/statusCode/@code','select donation_state_code_value, donation_state_code_label from donation_state_code;','4'),(5,'donation_failed_type','/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship//observation//value//@code','select a.donation_fail_code_value, b.concept_code from donation_fail_type_codes as a join concepts as b on a.donation_fail_code_snomed = b.id;','5'),(6,'donation_failed_cause','/ClinicalDocument/component/structuredBody/component/section/entry/procedure/entryRelationship/observation/code/@code','select a.donation_fail_cause_code_value, b.concept_code from donation_fail_causes_codes as a join concepts as b on a.donation_fail_cause_code_snomed = b.id;','6'),(7,'donation_blood_type','/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \'COMP\']//observation//code/@code','select a.blood_type_code_value, b.concept_code from blood_types_codes as a join concepts as b on a.blood_type_code_snomed = b.id;','7'),(8,'donation_type','/ClinicalDocument/component/structuredBody/component/section/code/@code','SELECT b.concept_code, a.donation_type_code_label  FROM donation_types_codes as a join  concepts as b where a.donation_type_code_snomed = b.id;','8'),(9,'label_analysis','/ClinicalDocument/component/structuredBody/component/section/entry/organizer/component/observation/code/@code','SELECT b.concept_code, a.donation_laboratoy_code_label FROM donation_laboratoy_codes as a join concepts as b on a.donation_laboratoy_code_snomed = b.id ;','9'),(11,'donor_type','/ClinicalDocument/component/structuredBody/component/section/entry/observation/code/@code','SELECT donation_donor_type_code_value, donation_donor_type_code_label FROM hemologica.donation_donor_types_codes;','11');
/*!40000 ALTER TABLE `donation_filter_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_laboratoy_codes`
--

DROP TABLE IF EXISTS `donation_laboratoy_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_laboratoy_codes` (
  `donation_laboratoy_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `donation_laboratoy_code_label` varchar(255) DEFAULT NULL,
  `donation_laboratoy_code_value` varchar(255) DEFAULT NULL,
  `donation_laboratoy_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`donation_laboratoy_code_id`),
  KEY `FK_52u5a3yalgskosejr5f2c88dn` (`donation_laboratoy_code_snomed`),
  CONSTRAINT `FK_52u5a3yalgskosejr5f2c88dn` FOREIGN KEY (`donation_laboratoy_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_laboratoy_codes`
--

LOCK TABLES `donation_laboratoy_codes` WRITE;
/*!40000 ALTER TABLE `donation_laboratoy_codes` DISABLE KEYS */;
INSERT INTO `donation_laboratoy_codes` VALUES (1,'label_analysis_syphilis','1',14),(2,'label_analysis_hepatitis_c','2',15),(3,'label_analysis_vih','3',16),(4,'label_analysis_hepatitis_b','4',55);
/*!40000 ALTER TABLE `donation_laboratoy_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_state_code`
--

DROP TABLE IF EXISTS `donation_state_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_state_code` (
  `donation_state_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `donation_state_code_label` varchar(255) DEFAULT NULL,
  `donation_state_code_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`donation_state_code_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_state_code`
--

LOCK TABLES `donation_state_code` WRITE;
/*!40000 ALTER TABLE `donation_state_code` DISABLE KEYS */;
INSERT INTO `donation_state_code` VALUES (1,'donation_state_made','completed'),(2,'donation_state_rejected','cancelled');
/*!40000 ALTER TABLE `donation_state_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_types_codes`
--

DROP TABLE IF EXISTS `donation_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_types_codes` (
  `donation_type_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `donation_type_code_label` varchar(255) DEFAULT NULL,
  `donation_type_code_value` varchar(255) DEFAULT NULL,
  `donation_type_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`donation_type_code_id`),
  KEY `FK_15u1pp2gkyvimrg1gsv9jql51` (`donation_type_code_snomed`),
  CONSTRAINT `FK_15u1pp2gkyvimrg1gsv9jql51` FOREIGN KEY (`donation_type_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_types_codes`
--

LOCK TABLES `donation_types_codes` WRITE;
/*!40000 ALTER TABLE `donation_types_codes` DISABLE KEYS */;
INSERT INTO `donation_types_codes` VALUES (1,'label_directed','1',39),(2,'label_autologous','2',40),(3,'label_common','3',41),(4,'label_apheresis','4',49);
/*!40000 ALTER TABLE `donation_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_severity_code`
--

DROP TABLE IF EXISTS `event_severity_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event_severity_code` (
  `event_severity_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `event_severity_code_label` varchar(255) DEFAULT NULL,
  `event_severity_code_value` varchar(255) DEFAULT NULL,
  `event_severity_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`event_severity_code_id`),
  KEY `FK_42opqffx3vi4k14qub1jchal5` (`event_severity_code_snomed`),
  CONSTRAINT `FK_42opqffx3vi4k14qub1jchal5` FOREIGN KEY (`event_severity_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_severity_code`
--

LOCK TABLES `event_severity_code` WRITE;
/*!40000 ALTER TABLE `event_severity_code` DISABLE KEYS */;
INSERT INTO `event_severity_code` VALUES (1,'event_mild','1',42),(2,'event_moderate','2',43),(3,'event_severe','3',44);
/*!40000 ALTER TABLE `event_severity_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gender_code`
--

DROP TABLE IF EXISTS `gender_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gender_code` (
  `gender_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gender_code_label` varchar(255) DEFAULT NULL,
  `gender_code_value` varchar(255) DEFAULT NULL,
  `gender_hl7_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gender_code_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gender_code`
--

LOCK TABLES `gender_code` WRITE;
/*!40000 ALTER TABLE `gender_code` DISABLE KEYS */;
INSERT INTO `gender_code` VALUES (1,'label_male','1','M'),(2,'label_female','2','F'),(3,'label_undefinded','0','UN');
/*!40000 ALTER TABLE `gender_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `geo_locations`
--

DROP TABLE IF EXISTS `geo_locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `geo_locations` (
  `geo_location_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `geo_locations_x` double DEFAULT NULL,
  `geo_locations_y` double DEFAULT NULL,
  PRIMARY KEY (`geo_location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `geo_locations`
--

LOCK TABLES `geo_locations` WRITE;
/*!40000 ALTER TABLE `geo_locations` DISABLE KEYS */;
INSERT INTO `geo_locations` VALUES (1,-34.89893,-56.165753),(2,-34.871729,-56.188868),(3,-34.758027,-56.272928);
/*!40000 ALTER TABLE `geo_locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identifications`
--

DROP TABLE IF EXISTS `identifications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `identifications` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `identificacion_code` varchar(255) DEFAULT NULL,
  `persons_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_jiumbarxt05w1x7ymttx9fu41` (`persons_id`),
  CONSTRAINT `FK_jiumbarxt05w1x7ymttx9fu41` FOREIGN KEY (`persons_id`) REFERENCES `persons` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identifications`
--

LOCK TABLES `identifications` WRITE;
/*!40000 ALTER TABLE `identifications` DISABLE KEYS */;
INSERT INTO `identifications` VALUES (1,'1',1),(2,'2',2);
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
  `identification_code` varchar(255) DEFAULT NULL,
  `identification_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_d5oau47baej0sch89o9algy34` (`identification_id`),
  CONSTRAINT `FK_d5oau47baej0sch89o9algy34` FOREIGN KEY (`identification_id`) REFERENCES `identifications` (`id`)
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
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `institution_code` varchar(255) DEFAULT NULL,
  `institution_display_name` varchar(255) DEFAULT NULL,
  `institution_oid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `institutions`
--

LOCK TABLES `institutions` WRITE;
/*!40000 ALTER TABLE `institutions` DISABLE KEYS */;
INSERT INTO `institutions` VALUES (1,'234','Hospital de Clinicas','323342343'),(2,'235','Asociacion Española','8903840932');
/*!40000 ALTER TABLE `institutions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message_send_Option`
--

DROP TABLE IF EXISTS `message_send_Option`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message_send_Option` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `label` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message_send_Option`
--

LOCK TABLES `message_send_Option` WRITE;
/*!40000 ALTER TABLE `message_send_Option` DISABLE KEYS */;
INSERT INTO `message_send_Option` VALUES (1,'label_all'),(2,'label_enable');
/*!40000 ALTER TABLE `message_send_Option` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movements`
--

DROP TABLE IF EXISTS `movements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movements` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `movement_date` datetime NOT NULL,
  `movement_center` bigint(20) DEFAULT NULL,
  `movements_types_id` bigint(20) DEFAULT NULL,
  `units_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_s6pm2apepsdeaotjgheu31m1u` (`movement_center`),
  KEY `FK_t58jrxo3a0gu4v32ciugcpd6x` (`movements_types_id`),
  KEY `FK_8shdtc97m8l075wugg1y15so0` (`units_id`),
  CONSTRAINT `FK_8shdtc97m8l075wugg1y15so0` FOREIGN KEY (`units_id`) REFERENCES `units` (`id`),
  CONSTRAINT `FK_s6pm2apepsdeaotjgheu31m1u` FOREIGN KEY (`movement_center`) REFERENCES `centers` (`id`),
  CONSTRAINT `FK_t58jrxo3a0gu4v32ciugcpd6x` FOREIGN KEY (`movements_types_id`) REFERENCES `movements_types` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movements`
--

LOCK TABLES `movements` WRITE;
/*!40000 ALTER TABLE `movements` DISABLE KEYS */;
INSERT INTO `movements` VALUES (4,'2015-12-10 00:00:00',1,1,4),(5,'2015-12-12 11:05:39',1,1,5),(6,'2015-12-12 11:05:39',1,1,6),(7,'2015-12-12 11:05:39',1,1,7),(8,'2015-12-12 11:05:39',1,1,8),(9,'2015-12-12 11:05:39',1,1,9),(10,'2015-12-12 11:05:39',1,1,10),(11,'2015-12-12 11:05:39',1,1,11),(12,'2015-12-12 11:05:39',1,1,12),(13,'2015-12-12 11:05:39',1,1,13),(14,'2015-12-12 11:05:39',1,1,14),(15,'2015-12-12 11:05:39',1,1,15),(16,'2015-12-12 11:05:39',1,1,17),(17,'2015-12-12 11:05:39',1,1,18),(18,'2015-12-12 11:05:39',1,1,19),(19,'2015-12-12 11:06:18',1,2,5),(20,'2015-12-12 11:06:18',1,2,6),(21,'2015-12-12 11:06:18',1,2,7),(22,'2015-12-12 11:06:18',1,2,8),(23,'2015-12-12 11:06:18',1,2,9),(24,'2015-12-12 11:06:18',1,2,10),(25,'2015-12-12 11:06:18',1,2,11),(26,'2015-12-12 11:06:18',1,2,12),(27,'2015-12-12 11:06:18',1,2,13),(28,'2015-12-12 11:06:18',1,2,14),(29,'2015-12-12 11:06:18',1,2,15),(30,'2015-12-12 11:06:18',1,2,17),(31,'2015-12-12 11:06:18',1,2,18),(32,'2015-12-12 11:06:18',1,2,19);
/*!40000 ALTER TABLE `movements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movements_types`
--

DROP TABLE IF EXISTS `movements_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movements_types` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `movement_type_code` varchar(255) DEFAULT NULL,
  `type` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movements_types`
--

LOCK TABLES `movements_types` WRITE;
/*!40000 ALTER TABLE `movements_types` DISABLE KEYS */;
INSERT INTO `movements_types` VALUES (1,'1',''),(2,'2','');
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
  `notifications_subject` varchar(255) DEFAULT NULL,
  `notifications_text` longtext,
  `notifications_bloodTypeABO` bigint(20) DEFAULT NULL,
  `notifications_bloodTypeRH` bigint(20) DEFAULT NULL,
  `notifications_messageSendOption` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_lrc5l6mjtbia1pn5mvhnwvwra` (`notifications_bloodTypeABO`),
  KEY `FK_5ymqnlrxqmpxqt9yo6ai16gq0` (`notifications_bloodTypeRH`),
  KEY `FK_i6ykjupb2gcgahdvw2ifxsmox` (`notifications_messageSendOption`),
  CONSTRAINT `FK_i6ykjupb2gcgahdvw2ifxsmox` FOREIGN KEY (`notifications_messageSendOption`) REFERENCES `message_send_Option` (`id`),
  CONSTRAINT `FK_5ymqnlrxqmpxqt9yo6ai16gq0` FOREIGN KEY (`notifications_bloodTypeRH`) REFERENCES `blood_d_types_codes` (`blood_d_type_code_id`),
  CONSTRAINT `FK_lrc5l6mjtbia1pn5mvhnwvwra` FOREIGN KEY (`notifications_bloodTypeABO`) REFERENCES `blood_abo_types_codes` (`blood_abo_type_code_id`)
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
  `notifications_id` bigint(20) DEFAULT NULL,
  `persons_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_1q59pbntvwhhn994t6vmqcde9` (`notifications_id`),
  KEY `FK_ch6uegto14n5jwpnfv0unb4c4` (`persons_id`),
  CONSTRAINT `FK_ch6uegto14n5jwpnfv0unb4c4` FOREIGN KEY (`persons_id`) REFERENCES `persons` (`id`),
  CONSTRAINT `FK_1q59pbntvwhhn994t6vmqcde9` FOREIGN KEY (`notifications_id`) REFERENCES `notifications` (`id`)
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
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
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
  `person_allow_notification_able` bit(1) DEFAULT NULL,
  `person_allow_notification_need_donor` bit(1) DEFAULT NULL,
  `person_address` varchar(255) DEFAULT NULL,
  `person_birthday` date DEFAULT NULL,
  `person_email` varchar(255) DEFAULT NULL,
  `person_first_lastname` varchar(255) DEFAULT NULL,
  `person_first_name` varchar(255) DEFAULT NULL,
  `person_second_lastname` varchar(255) DEFAULT NULL,
  `person_second_name` varchar(255) DEFAULT NULL,
  `person_telephone` varchar(255) DEFAULT NULL,
  `person_zip_code` varchar(255) DEFAULT NULL,
  `person_city` bigint(20) DEFAULT NULL,
  `person_gender` bigint(20) DEFAULT NULL,
  `person_state` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_t49hr8rv75wsolpm8cmcr46kq` (`person_city`),
  KEY `FK_3pfkwjgp3e3fmvdjfswpdr99d` (`person_gender`),
  KEY `FK_93gbkahb01kjcuxxpdqsanrdc` (`person_state`),
  CONSTRAINT `FK_93gbkahb01kjcuxxpdqsanrdc` FOREIGN KEY (`person_state`) REFERENCES `states_codes` (`state_id`),
  CONSTRAINT `FK_3pfkwjgp3e3fmvdjfswpdr99d` FOREIGN KEY (`person_gender`) REFERENCES `gender_code` (`gender_code_id`),
  CONSTRAINT `FK_t49hr8rv75wsolpm8cmcr46kq` FOREIGN KEY (`person_city`) REFERENCES `cities_codes` (`city_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons` VALUES (1,'','','Rivera 2711',NULL,NULL,'Roche','Paula','De Polsi',NULL,'099358717',NULL,1,NULL,NULL),(2,'\0','\0','Gonzalo Ramirez 678',NULL,NULL,'Strasser','Bruno','Mazza','Guillermo','099567345',NULL,1,NULL,NULL);
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
  `person_record_identification_id` varchar(255) DEFAULT NULL,
  `persons_record_cda_extension` varchar(255) DEFAULT NULL,
  `persons_record_cda_root` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
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
-- Table structure for table `responsible_transfusion_person`
--

DROP TABLE IF EXISTS `responsible_transfusion_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `responsible_transfusion_person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `person_center` bigint(20) DEFAULT NULL,
  `person` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_26kwnxvroh1xf8g4ri7lxstkv` (`person_center`),
  KEY `FK_92671t11p375gvrvlcosmnng` (`person`),
  CONSTRAINT `FK_92671t11p375gvrvlcosmnng` FOREIGN KEY (`person`) REFERENCES `persons` (`id`),
  CONSTRAINT `FK_26kwnxvroh1xf8g4ri7lxstkv` FOREIGN KEY (`person_center`) REFERENCES `centers` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `responsible_transfusion_person`
--

LOCK TABLES `responsible_transfusion_person` WRITE;
/*!40000 ALTER TABLE `responsible_transfusion_person` DISABLE KEYS */;
INSERT INTO `responsible_transfusion_person` VALUES (1,4,1),(2,4,2);
/*!40000 ALTER TABLE `responsible_transfusion_person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `results_code`
--

DROP TABLE IF EXISTS `results_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `results_code` (
  `results_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `boolean_results_code_value` bit(1) DEFAULT NULL,
  `results_code_label` varchar(255) DEFAULT NULL,
  `results_code_value` varchar(255) DEFAULT NULL,
  `results_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`results_code_id`),
  KEY `FK_chfrfr1jwkav0xk6qv0xloxlo` (`results_code_snomed`),
  CONSTRAINT `FK_chfrfr1jwkav0xk6qv0xloxlo` FOREIGN KEY (`results_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `results_code`
--

LOCK TABLES `results_code` WRITE;
/*!40000 ALTER TABLE `results_code` DISABLE KEYS */;
INSERT INTO `results_code` VALUES (1,'','label_positive','1',45),(2,'\0','label_negative','2',46);
/*!40000 ALTER TABLE `results_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'doctor','');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_permissions`
--

DROP TABLE IF EXISTS `role_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_permissions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `permissions_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_a4fq53k4nkqxrx269khks3764` (`permissions_id`),
  KEY `FK_d4atqq8ege1sij0316vh2mxfu` (`role_id`),
  CONSTRAINT `FK_d4atqq8ege1sij0316vh2mxfu` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `FK_a4fq53k4nkqxrx269khks3764` FOREIGN KEY (`permissions_id`) REFERENCES `permissions` (`id`)
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
-- Table structure for table `sequencer`
--

DROP TABLE IF EXISTS `sequencer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sequencer` (
  `sequencer_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `sequencer_code_name` varchar(255) DEFAULT NULL,
  `sequencer_code_value` varchar(255) DEFAULT NULL,
  `sequencer_number` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`sequencer_code_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sequencer`
--

LOCK TABLES `sequencer` WRITE;
/*!40000 ALTER TABLE `sequencer` DISABLE KEYS */;
INSERT INTO `sequencer` VALUES (1,'Hemologica Cdas','2.16.858.0.0.1.10.2.3.1.1.1',0),(2,'Hemologica HC Cda','2.16.858.0.0.1.10.2.3.1.1.2',0);
/*!40000 ALTER TABLE `sequencer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `states_codes`
--

DROP TABLE IF EXISTS `states_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `states_codes` (
  `state_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `state_code` varchar(255) DEFAULT NULL,
  `state_display_name` varchar(255) DEFAULT NULL,
  `state_country` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`state_id`),
  KEY `FK_okro8cdciixs6h141l2hp6u7r` (`state_country`),
  CONSTRAINT `FK_okro8cdciixs6h141l2hp6u7r` FOREIGN KEY (`state_country`) REFERENCES `countries_codes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `states_codes`
--

LOCK TABLES `states_codes` WRITE;
/*!40000 ALTER TABLE `states_codes` DISABLE KEYS */;
INSERT INTO `states_codes` VALUES (1,'1','label_montevideo',1),(2,'3','label_canelones',1),(3,'3','label_maldonado',1),(4,'4','label_rocha',1),(5,'5','label_buenos_aires',2),(6,'6','label_cordoba',2);
/*!40000 ALTER TABLE `states_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transfusion_events_codes`
--

DROP TABLE IF EXISTS `transfusion_events_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transfusion_events_codes` (
  `transfusion_event_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `transfusion_event_code_label` varchar(255) DEFAULT NULL,
  `transfusion_event_code_value` varchar(255) DEFAULT NULL,
  `transfusion_event_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`transfusion_event_code_id`),
  KEY `FK_rdqud8wflagyab6gnsgh6xvm6` (`transfusion_event_code_snomed`),
  CONSTRAINT `FK_rdqud8wflagyab6gnsgh6xvm6` FOREIGN KEY (`transfusion_event_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfusion_events_codes`
--

LOCK TABLES `transfusion_events_codes` WRITE;
/*!40000 ALTER TABLE `transfusion_events_codes` DISABLE KEYS */;
INSERT INTO `transfusion_events_codes` VALUES (1,'label_viral_hepatitis','1',25),(2,'label_transfusional_hemosiderosis','2',26),(3,'label_abo_incompatibility_reaction','3',27),(4,'label_rh_incompatibility_reaction','4',28),(5,'label_febrile_reaction','5',29),(6,'label_allergic_reaction','6',30);
/*!40000 ALTER TABLE `transfusion_events_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transfusion_filter_codes`
--

DROP TABLE IF EXISTS `transfusion_filter_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transfusion_filter_codes` (
  `transfusion_filter_codes_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `transfusion_filter_codes_label` varchar(255) DEFAULT NULL,
  `transfusion_filter_codes_path` varchar(255) DEFAULT NULL,
  `transfusion_filter_codes_sql` varchar(255) DEFAULT NULL,
  `transfusion_filter_codes_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`transfusion_filter_codes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfusion_filter_codes`
--

LOCK TABLES `transfusion_filter_codes` WRITE;
/*!40000 ALTER TABLE `transfusion_filter_codes` DISABLE KEYS */;
INSERT INTO `transfusion_filter_codes` VALUES (1,'label_product','/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//@code','select b.concept_code , a.unit_type_code_label from units_types as a join concepts as b on a.unit_type_code_snomed = b.id;','1'),(2,'label_age_from','/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value',NULL,'2'),(3,'label_age_to','/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value',NULL,'3'),(4,'label_gender','/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code','select gender_code_value, gender_code_label from gender_code;','4'),(5,'label_adverse_events','/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/code/@code','select b.concept_code , a.transfusion_event_code_label from transfusion_events_codes as a join concepts as b on a.transfusion_event_code_snomed = b.id;','5'),(6,'label_severity','/ClinicalDocument//component//structuredBody//component//section//entry//observation//$1//interpretationCode//@code','select b.concept_code , a.event_severity_code_label from event_severity_code as a join concepts as b on a.event_severity_code_snomed = b.id;','6');
/*!40000 ALTER TABLE `transfusion_filter_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transfusion_laboratory_codes`
--

DROP TABLE IF EXISTS `transfusion_laboratory_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transfusion_laboratory_codes` (
  `transfusion_laboratory_code_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `transfusion_laboratory_code_label` varchar(255) DEFAULT NULL,
  `transfusion_laboratory_code_value` varchar(255) DEFAULT NULL,
  `transfusion_laboratory_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`transfusion_laboratory_code_id`),
  KEY `FK_mfn8k167hjxcc8lcbco0h61xc` (`transfusion_laboratory_code_snomed`),
  CONSTRAINT `FK_mfn8k167hjxcc8lcbco0h61xc` FOREIGN KEY (`transfusion_laboratory_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfusion_laboratory_codes`
--

LOCK TABLES `transfusion_laboratory_codes` WRITE;
/*!40000 ALTER TABLE `transfusion_laboratory_codes` DISABLE KEYS */;
INSERT INTO `transfusion_laboratory_codes` VALUES (1,'label_direct_coombs ','1',23),(2,'label_indirect_coombs ','2',24);
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
  `unit_state` bit(1) DEFAULT NULL,
  `unit_institution_code` varchar(255) DEFAULT NULL,
  `unit_uuid` varchar(255) DEFAULT NULL,
  `blood_abo_type` bigint(20) DEFAULT NULL,
  `blood_rh_type` bigint(20) DEFAULT NULL,
  `unit_institution_center_id` bigint(20) DEFAULT NULL,
  `unit_parent` bigint(20) DEFAULT NULL,
  `unit_type` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_fprxbvptc9qfhloo74gldkpsu` (`blood_abo_type`),
  KEY `FK_p4db64i5g96hmi2cyl4uu3xgd` (`blood_rh_type`),
  KEY `FK_nfjfl73elb2iogfec5m27w89q` (`unit_institution_center_id`),
  KEY `FK_aafagm6sbysbeivuxb75whi60` (`unit_parent`),
  KEY `FK_g5d1amfrvh4qboerc0r1a9dmv` (`unit_type`),
  CONSTRAINT `FK_g5d1amfrvh4qboerc0r1a9dmv` FOREIGN KEY (`unit_type`) REFERENCES `units_types` (`unit_type_id`),
  CONSTRAINT `FK_aafagm6sbysbeivuxb75whi60` FOREIGN KEY (`unit_parent`) REFERENCES `units` (`id`),
  CONSTRAINT `FK_fprxbvptc9qfhloo74gldkpsu` FOREIGN KEY (`blood_abo_type`) REFERENCES `blood_abo_types_codes` (`blood_abo_type_code_id`),
  CONSTRAINT `FK_nfjfl73elb2iogfec5m27w89q` FOREIGN KEY (`unit_institution_center_id`) REFERENCES `centers` (`id`),
  CONSTRAINT `FK_p4db64i5g96hmi2cyl4uu3xgd` FOREIGN KEY (`blood_rh_type`) REFERENCES `blood_d_types_codes` (`blood_d_type_code_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `units`
--

LOCK TABLES `units` WRITE;
/*!40000 ALTER TABLE `units` DISABLE KEYS */;
INSERT INTO `units` VALUES (4,'','1000000','6e973e21-3ff2-4832-9ea6-0f24587be57c',4,2,1,NULL,4),(5,'','10000001','2839835f-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(6,'','10000002','283986b6-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(7,'','10000003','2839876f-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(8,'','10000004','28398804-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(9,'','10000005','2839889a-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(10,'','10000006','7ceef088-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(11,'','10000007','7ceef2ea-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(12,'','10000008','7ceef399-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(13,'','10000009','7ceef42c-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(14,'','10000010','7ceef4b4-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(15,'','10000011','7ceef53a-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(16,'','10000012','7ceef5c8-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(17,'','10000013','7ceef653-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(18,'','10000014','7ceef6d9-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(19,'','10000015','7ceef764-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(20,'','10000016','7ceef7ef-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(21,'','10000017','7ceef877-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(22,'','10000018','7ceef90d-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4),(23,'','10000019','7ceef994-a0d7-11e5-97fa-208984bbdd79',4,2,1,NULL,4);
/*!40000 ALTER TABLE `units` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `units_types`
--

DROP TABLE IF EXISTS `units_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `units_types` (
  `unit_type_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `unit_type_code_label` varchar(255) DEFAULT NULL,
  `unit_type_code_value` varchar(255) DEFAULT NULL,
  `unit_type_code_snomed` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`unit_type_id`),
  KEY `FK_1es6c45nvrtsd5duwibi1w96w` (`unit_type_code_snomed`),
  CONSTRAINT `FK_1es6c45nvrtsd5duwibi1w96w` FOREIGN KEY (`unit_type_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `units_types`
--

LOCK TABLES `units_types` WRITE;
/*!40000 ALTER TABLE `units_types` DISABLE KEYS */;
INSERT INTO `units_types` VALUES (1,'label_plaquetas','1',7),(2,'label_crioprecipitado','2',8),(3,'label_plasma','3',9),(4,'label_eritrocitos','4',10),(5,'label_hematies','5',54);
/*!40000 ALTER TABLE `units_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_account` bit(1) DEFAULT NULL,
  `active_account_token` varchar(255) DEFAULT NULL,
  `active_account_token_time` datetime DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `password_reset` bit(1) DEFAULT NULL,
  `password_reset_token` varchar(255) DEFAULT NULL,
  `password_reset_token_time` datetime DEFAULT NULL,
  `persons_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_di0fqg1nd2jpvr1rkabv9hcja` (`persons_id`),
  CONSTRAINT `FK_di0fqg1nd2jpvr1rkabv9hcja` FOREIGN KEY (`persons_id`) REFERENCES `persons` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,NULL,NULL,NULL,'1',NULL,NULL,NULL,NULL,1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_role_services`
--

DROP TABLE IF EXISTS `users_role_services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_role_services` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `center_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_2v7tnjo2wi6ads2jfc85r9wul` (`center_id`),
  KEY `FK_mu40tv2h82hbvkhi59b228nlw` (`role_id`),
  KEY `FK_5o4ppdojg8dgttitldhlr8gyf` (`user_id`),
  CONSTRAINT `FK_5o4ppdojg8dgttitldhlr8gyf` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `FK_2v7tnjo2wi6ads2jfc85r9wul` FOREIGN KEY (`center_id`) REFERENCES `centers` (`id`),
  CONSTRAINT `FK_mu40tv2h82hbvkhi59b228nlw` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_role_services`
--

LOCK TABLES `users_role_services` WRITE;
/*!40000 ALTER TABLE `users_role_services` DISABLE KEYS */;
INSERT INTO `users_role_services` VALUES (1,1,1,1);
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

-- Dump completed on 2015-12-20 13:33:19
