DROP DATABASE `hemologica`;
CREATE DATABASE  IF NOT EXISTS `hemologica` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hemologica`;
-- MySQL dump 10.13  Distrib 5.6.13, for osx10.6 (i386)
--
-- Host: localhost    Database: hemologica
-- ------------------------------------------------------
-- Server version	5.6.25

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
  `advertisment_subtitle` varchar(255) DEFAULT NULL,
  `advertisment_summary` longtext,
  `advertisment_text` longtext,
  `advertisment_title` varchar(255) DEFAULT NULL,
  `advertisment_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advertisments`
--

LOCK TABLES `advertisments` WRITE;
/*!40000 ALTER TABLE `advertisments` DISABLE KEYS */;
INSERT INTO `advertisments` VALUES (1,'Sub Titulo 1','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 1','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.','Titulo 1','2015-11-05'),(2,'Sub Titulo 2','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 2','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 2','Titulo 2','2015-06-05'),(3,'Sub Titulo 3','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 3','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 3','Titulo 3','2014-04-05'),(4,'Sub Titulo 4','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 4','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 4','Titulo 4','2014-03-05'),(5,'Sub Titulo 5','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 5','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 5','Titulo 5','2014-01-03'),(6,'Sub Titulo 6','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 6','Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. 6','Titulo 6','2014-01-15'),(7,'asfda','fsdfs','asf','fdfsf','2015-11-24'),(8,'Subtitulo','Resumen','Mensaje','titulo','2015-11-24'),(9,'Soy un Subtitulo','Este es el resumen','<span style=\"font-family: Arial, Verdana; font-size: 10pt;\">ffdsafsa</span><div style=\"font-family: Arial, Verdana; font-size: 10pt; font-style: normal; font-variant: normal; font-weight: normal; line-height: normal;\"><br></div><div style=\"font-family: Arial, Verdana; font-size: 10pt; font-style: normal; font-variant: normal; font-weight: normal; line-height: normal;\"><br></div><div style=\"font-family: Arial, Verdana; font-size: 10pt; font-style: normal; font-variant: normal; font-weight: normal; line-height: normal;\">dasffsa</div><div><ol><li><span style=\"font-family: Arial, Verdana; font-size: 13.3333px;\">fdalf</span></li><li><span style=\"font-family: Arial, Verdana; font-size: 13.3333px;\">dasfalk</span></li></ol></div>','SOy un titulo','2015-12-01'),(10,'aaa','sss','ffff','fff','2015-12-20'),(11,'fdddd','dsss','','f','2015-12-20'),(12,'sss','ss','sss','ff','2015-12-20'),(13,'aa','ss','fff','fff','2015-12-20'),(14,'ss','sss','sss','ff','2015-12-20'),(15,'s','s','sss','s','2015-12-20'),(16,'ss','ss','ss','ff','2015-12-20'),(17,'ffffff','hooaaaa','fdsfjaspoifha','holaaaa','2015-12-20');
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_abo_types_codes`
--

LOCK TABLES `blood_abo_types_codes` WRITE;
/*!40000 ALTER TABLE `blood_abo_types_codes` DISABLE KEYS */;
INSERT INTO `blood_abo_types_codes` VALUES (1,'1','A',1),(2,'2','AB',2),(3,'3','B',3),(4,'4','O',4);
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_d_types_codes`
--

LOCK TABLES `blood_d_types_codes` WRITE;
/*!40000 ALTER TABLE `blood_d_types_codes` DISABLE KEYS */;
INSERT INTO `blood_d_types_codes` VALUES (1,'1','RH+',6),(2,'2','RH-',5);
/*!40000 ALTER TABLE `blood_d_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blood_types_codes`
--

DROP TABLE IF EXISTS `blood_types_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blood_types_codes` (
  `blood_type_code_id` int(11) NOT NULL,
  `blood_type_code_label` varchar(255) DEFAULT NULL,
  `blood_type_code_value` varchar(255) DEFAULT NULL,
  `blood_type_code_snomed` int(11) DEFAULT NULL,
  `blood_abo_type_code_snomed` int(11) DEFAULT NULL,
  `blood_rh_type_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`blood_type_code_id`),
  KEY `FK_elt7cyxnqs67ipp0q7ccty6fv` (`blood_type_code_snomed`),
  KEY `FK_jjes06hlauvahxhvinegln0mf` (`blood_abo_type_code_snomed`),
  KEY `FK_iga3i2b6f54x8ygtas7tccaf2` (`blood_rh_type_code_snomed`),
  CONSTRAINT `FK_elt7cyxnqs67ipp0q7ccty6fv` FOREIGN KEY (`blood_type_code_snomed`) REFERENCES `concepts` (`id`),
  CONSTRAINT `FK_iga3i2b6f54x8ygtas7tccaf2` FOREIGN KEY (`blood_rh_type_code_snomed`) REFERENCES `concepts` (`id`),
  CONSTRAINT `FK_jjes06hlauvahxhvinegln0mf` FOREIGN KEY (`blood_abo_type_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_types_codes`
--

LOCK TABLES `blood_types_codes` WRITE;
/*!40000 ALTER TABLE `blood_types_codes` DISABLE KEYS */;
INSERT INTO `blood_types_codes` VALUES (1,'label_orh-','1',31,4,2),(2,'label_orh+','2',32,4,1),(3,'label_arh-','3',33,1,2),(4,'label_arh+','4',34,1,1),(5,'label_abrh-','5',35,2,2),(6,'label_abh+','6',36,2,1),(7,'label_brh-','7',37,3,2),(8,'label_brh+','8',38,3,1);
/*!40000 ALTER TABLE `blood_types_codes` ENABLE KEYS */;
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
  `center_oid` varchar(100) DEFAULT NULL,
  `center_address` varchar(255) DEFAULT NULL,
  `center_email` varchar(255) DEFAULT NULL,
  `center_hour` varchar(255) DEFAULT NULL,
  `center_information` varchar(255) DEFAULT NULL,
  `center_telephone` varchar(255) DEFAULT NULL,
  `center_type` int(11) DEFAULT NULL,
  `center_location` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_centers_institutions1_idx` (`center_institution_id`),
  CONSTRAINT `fk_centers_2` FOREIGN KEY (`center_institution_id`) REFERENCES `institutions` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `centers`
--

LOCK TABLES `centers` WRITE;
/*!40000 ALTER TABLE `centers` DISABLE KEYS */;
INSERT INTO `centers` VALUES (1,1,'2.16.858.0.0.1.10.2.3.6','Banco de Sangre 1','987658','Av Italia 345','infobanco1@hc.com','Lunes a viernes de 8 - 18 hs ','Se dan 40 numeros a partir de las 8 am.','12345678',0,'1'),(2,2,'2.16.858.0.0.1.10.2.3.7','Banco de Sangre 2','654789','Rivera 567','infobanco2@hc.com','Lunes a viernes de 8 - 20 hs y Sabados 8 - 12 ','Pedir hora por telefono','098765432',0,'2'),(3,2,'347','Banco de Sangre 3','356789','Melilla 7356','infobanco3@hc.com','Lunes a jueves de 8 - 20 hs y Sabados 8 - 12 ','Pedir hora por la pagina web bancoDesangre3.org.uy','098765432',0,'3'),(4,1,'348','Centro Transfusional 1','098755',NULL,NULL,NULL,NULL,NULL,1,NULL),(5,2,'349','Centro Transfusional 2','567876',NULL,NULL,NULL,NULL,NULL,1,NULL);
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
INSERT INTO `cities_codes` VALUES (1,1,'1','label_montevideo'),(2,2,'2','label_las_piedras'),(3,2,'3','label_canelones'),(4,2,'4','label_atlantida'),(5,3,'5','label_punta_del_este'),(6,3,'6','label_piriapolis'),(7,3,'7','label_maldonado');
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
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `concepts_id` int(11) NOT NULL,
  `concepts_label` varchar(255) DEFAULT NULL,
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
  `country_code_label` varchar(255) DEFAULT NULL,
  `country_code_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries_codes`
--

LOCK TABLES `countries_codes` WRITE;
/*!40000 ALTER TABLE `countries_codes` DISABLE KEYS */;
INSERT INTO `countries_codes` VALUES (1,'label_uruguay','858'),(2,'label_argentina','032'),(3,'label_brasil','3'),(4,'label_chile','4'),(5,'label_unknown_country','5');
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
INSERT INTO `documents` VALUES (1,1,1,'46714299',1),(2,1,1,'35679873',2);
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
  `donation_donor_type_code_id` int(11) NOT NULL AUTO_INCREMENT,
  `donation_donor_type_code_label` varchar(45) NOT NULL,
  `donation_donor_type_code_value` varchar(45) NOT NULL,
  `donation_donor_type_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`donation_donor_type_code_id`),
  KEY `fk_donation_donor_types_codes_1_idx` (`donation_donor_type_code_snomed`),
  CONSTRAINT `fk_donation_donor_types_codes_1` FOREIGN KEY (`donation_donor_type_code_snomed`) REFERENCES `concepts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
INSERT INTO `donation_events_codes` VALUES (1,'1','label_dizziness',17),(2,'2','label_lipothymy',18),(3,'3','label_convulsion',19),(4,'4','label_vomiting',20),(5,'5','label_hematoma',21),(6,'6','label_cardiac_arrhythmia',22);
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
  `donation_fail_cause_code_snomed` int(11) DEFAULT NULL,
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
INSERT INTO `donation_fail_causes_codes` VALUES (1,'1','label_administrative_rejection',11),(2,'2','label_antecedent',12),(3,'3','label_low_pressure',13),(4,'4','label_low_weight',50),(5,'5','label_low_hemoglobin',51),(6,'6','label_travel',52),(7,'7','label_behavior',53);
/*!40000 ALTER TABLE `donation_fail_causes_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_fail_type_codes`
--

DROP TABLE IF EXISTS `donation_fail_type_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_fail_type_codes` (
  `donation_fail_code_id` int(11) NOT NULL,
  `donation_fail_code_label` varchar(255) DEFAULT NULL,
  `donation_fail_code_value` varchar(255) DEFAULT NULL,
  `donation_fail_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`donation_fail_code_id`),
  KEY `FK_fm1gejnnnvtar0w21wq0qvd30` (`donation_fail_code_snomed`),
  CONSTRAINT `FK_fm1gejnnnvtar0w21wq0qvd30` FOREIGN KEY (`donation_fail_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
  `donation_filter_codes_id` int(11) NOT NULL,
  `donation_filter_codes_label` varchar(255) DEFAULT NULL,
  `donation_filter_codes_path` varchar(255) DEFAULT NULL,
  `donation_filter_codes_value` varchar(255) DEFAULT NULL,
  `donation_filter_codes_sql` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`donation_filter_codes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_filter_codes`
--

LOCK TABLES `donation_filter_codes` WRITE;
/*!40000 ALTER TABLE `donation_filter_codes` DISABLE KEYS */;
INSERT INTO `donation_filter_codes` VALUES (2,'label_age_from','/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value','2',NULL),(3,'label_age_to','/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value','3',NULL),(4,'donation_state_made','/ClinicalDocument/component/structuredBody/component/section/entry/procedure/statusCode/@code','4','select donation_state_code_value, donation_state_code_label from donation_state_code;'),(5,'donation_failed_type','/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship//observation//value//@code','5','select b.concept_code, a.donation_fail_code_label from donation_fail_type_codes as a join concepts as b on a.donation_fail_code_snomed = b.id;'),(6,'donation_failed_cause','/ClinicalDocument/component/structuredBody/component/section/entry/procedure/entryRelationship/observation/code/@code','6','select b.concept_code, a.donation_fail_cause_code_label from donation_fail_causes_codes as a join concepts as b on a.donation_fail_cause_code_snomed = b.id;'),(7,'donation_blood_type','/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \'COMP\']//observation//code/@code','7','select b.concept_code, a.blood_type_code_label from blood_types_codes as a join concepts as b on a.blood_type_code_snomed = b.id;'),(8,'donation_type','/ClinicalDocument/component/structuredBody/component/section/code/@code','8','SELECT b.concept_code, a.donation_type_code_label  FROM donation_types_codes as a join  concepts as b where a.donation_type_code_snomed = b.id;'),(9,'label_analysis','/ClinicalDocument/component/structuredBody/component/section/entry/organizer/component/observation/code/@code','9','SELECT b.concept_code, a.donation_laboratoy_code_label FROM donation_laboratoy_codes as a join concepts as b on a.donation_laboratoy_code_snomed = b.id ;'),(10,'donation_lab_result_value','/ClinicalDocument//component//structuredBody//component//section//entry//component//$1//value/@code','10','SELECT b.concept_code,a.results_code_label FROM hemologica.results_code as a join concepts as b on a.results_code_snomed = b.id;'),(11,'donor_type','/ClinicalDocument/component/structuredBody/component/section/entry/observation/code/@code','11','SELECT donation_donor_type_code_value, donation_donor_type_code_label FROM hemologica.donation_donor_types_codes;'),(12,'label_gender','/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code','1','select gender_code_value, gender_code_label from gender_code;');
/*!40000 ALTER TABLE `donation_filter_codes` ENABLE KEYS */;
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
INSERT INTO `donation_laboratoy_codes` VALUES (1,'1','label_analysis_syphilis',14),(2,'2','label_analysis_hepatitis_c',15),(3,'3','label_analysis_vih',16),(4,'4','label_analysis_hepatitis_b',55);
/*!40000 ALTER TABLE `donation_laboratoy_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_state_code`
--

DROP TABLE IF EXISTS `donation_state_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_state_code` (
  `donation_state_code_id` int(11) NOT NULL,
  `donation_state_code_label` varchar(255) DEFAULT NULL,
  `donation_state_code_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`donation_state_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_states_codes`
--

LOCK TABLES `donation_states_codes` WRITE;
/*!40000 ALTER TABLE `donation_states_codes` DISABLE KEYS */;
INSERT INTO `donation_states_codes` VALUES (1,'1','donation_state_made'),(2,'2','donation_state_rejected');
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_types_codes`
--

LOCK TABLES `donation_types_codes` WRITE;
/*!40000 ALTER TABLE `donation_types_codes` DISABLE KEYS */;
INSERT INTO `donation_types_codes` VALUES (1,'1','label_directed',39),(2,'2','label_autologous',40),(3,'3','label_common',41),(4,'4','label_apheresis',49);
/*!40000 ALTER TABLE `donation_types_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email_sent`
--

DROP TABLE IF EXISTS `email_sent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email_sent` (
  `email_sent_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email_effective_sent_date` date DEFAULT NULL,
  `email_sent_date` date DEFAULT NULL,
  `email_sent_from` varchar(255) DEFAULT NULL,
  `email_sent_subject` varchar(255) DEFAULT NULL,
  `email_sent_text` longtext,
  `email_sent_to` varchar(255) DEFAULT NULL,
  `email_sent_person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`email_sent_id`),
  KEY `FK_rvuv2crk9eykemda7bkfx197w` (`email_sent_person_id`),
  CONSTRAINT `FK_rvuv2crk9eykemda7bkfx197w` FOREIGN KEY (`email_sent_person_id`) REFERENCES `persons` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email_sent`
--

LOCK TABLES `email_sent` WRITE;
/*!40000 ALTER TABLE `email_sent` DISABLE KEYS */;
INSERT INTO `email_sent` VALUES (1,'2016-01-06','2016-04-05','brunostrasser18@gmail.com','YoDono - Estas apto para donar sangre',NULL,'pula14@gmail.com',1),(2,'2016-01-06','2016-04-04','brunostrasser18@gmail.com','YoDono - Estas apto para donar sangre',NULL,'pula14@gmail.com',1),(3,'2016-01-06','2016-04-04','brunostrasser18@gmail.com','YoDono - Estas apto para donar sangre',NULL,'pula14@gmail.com',1),(4,'2016-01-06','2016-01-06','brunostrasser18@gmail.com','YoDono - Estas apto para donar sangre',NULL,'pula14@gmail.com',1),(5,'2016-01-06','2016-01-06','brunostrasser18@gmail.com','YoDono - Estas apto para donar sangre',NULL,'pula14@gmail.com',1),(6,'2016-01-06','2016-01-06','brunostrasser18@gmail.com','YoDono - Estas apto para donar sangre',NULL,'pula14@gmail.com',1),(7,'2016-01-06','2016-01-06','brunostrasser18@gmail.com','YoDono - Estas apto para donar sangre','Estas nuevamente apto para donar sangre. <br> Busca en www.yodono.com.uy el banco de sangre que te quede mejor y ayuda a salvar vidas. <br><br> Muchas gracias','pula14@gmail.com',1),(8,'2016-01-06','2016-01-06','brunostrasser18@gmail.com','YoDono - Estas apto para donar sangre','Estas nuevamente apto para donar sangre. <br> Busca en www.yodono.com.uy el banco de sangre que te quede mejor y ayuda a salvar vidas. <br><br> Muchas gracias','pula14@gmail.com',1);
/*!40000 ALTER TABLE `email_sent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email_to_send`
--

DROP TABLE IF EXISTS `email_to_send`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email_to_send` (
  `email_to_send_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email_to_send_date` date DEFAULT NULL,
  `email_to_send_subject` varchar(255) DEFAULT NULL,
  `email_to_send_text` longtext,
  `email_to_send_person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`email_to_send_id`),
  KEY `FK_9blntbx6e9eehx86hjejsoko9` (`email_to_send_person_id`),
  CONSTRAINT `FK_9blntbx6e9eehx86hjejsoko9` FOREIGN KEY (`email_to_send_person_id`) REFERENCES `persons` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email_to_send`
--

LOCK TABLES `email_to_send` WRITE;
/*!40000 ALTER TABLE `email_to_send` DISABLE KEYS */;
INSERT INTO `email_to_send` VALUES (9,'2016-05-06','YoDono - Estas apto para donar sangre','Estas nuevamente apto para donar sangre. <br> Busca en www.yodono.com.uy el banco de sangre que te quede mejor y ayuda a salvar vidas. <br><br> Muchas gracias',1);
/*!40000 ALTER TABLE `email_to_send` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_severity_code`
--

DROP TABLE IF EXISTS `event_severity_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event_severity_code` (
  `event_severity_code_id` int(11) NOT NULL,
  `event_severity_code_label` varchar(255) DEFAULT NULL,
  `event_severity_code_value` varchar(255) DEFAULT NULL,
  `event_severity_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`event_severity_code_id`),
  KEY `FK_42opqffx3vi4k14qub1jchal5` (`event_severity_code_snomed`),
  CONSTRAINT `FK_42opqffx3vi4k14qub1jchal5` FOREIGN KEY (`event_severity_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
  `gender_code_id` int(11) NOT NULL,
  `gender_code_label` varchar(255) DEFAULT NULL,
  `gender_code_value` varchar(255) DEFAULT NULL,
  `gender_hl7_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gender_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
  `geo_location_id` varchar(255) NOT NULL,
  `geo_locations_x` double DEFAULT NULL,
  `geo_locations_y` double DEFAULT NULL,
  PRIMARY KEY (`geo_location_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `geo_locations`
--

LOCK TABLES `geo_locations` WRITE;
/*!40000 ALTER TABLE `geo_locations` DISABLE KEYS */;
INSERT INTO `geo_locations` VALUES ('1',-34.89893,-56.165753),('2',-34.871729,-56.188868),('3',-34.758027,-56.272928);
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (5);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identifications`
--

DROP TABLE IF EXISTS `identifications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `identifications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
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
INSERT INTO `identifications` VALUES (1,1,'1'),(2,2,'2');
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
  `id` varchar(255) NOT NULL,
  `label` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message_send_Option`
--

LOCK TABLES `message_send_Option` WRITE;
/*!40000 ALTER TABLE `message_send_Option` DISABLE KEYS */;
INSERT INTO `message_send_Option` VALUES ('1','label_all'),('2','label_enable');
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
  `units_id` bigint(20) NOT NULL,
  `movements_types_id` int(11) NOT NULL,
  `movement_id` int(11) DEFAULT NULL,
  `movement_date` datetime NOT NULL,
  `movement_center` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_movements_units1_idx` (`units_id`),
  KEY `fk_movements_movements_types1_idx` (`movements_types_id`),
  KEY `FK_58f01wdt4bs6i35gb2epbtsk` (`movement_id`),
  CONSTRAINT `FK_58f01wdt4bs6i35gb2epbtsk` FOREIGN KEY (`movement_id`) REFERENCES `centers` (`id`),
  CONSTRAINT `fk_movements_movements_types1` FOREIGN KEY (`movements_types_id`) REFERENCES `movements_types` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_movements_units1` FOREIGN KEY (`units_id`) REFERENCES `units` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movements`
--

LOCK TABLES `movements` WRITE;
/*!40000 ALTER TABLE `movements` DISABLE KEYS */;
-- INSERT INTO `movements` VALUES (1,1,1,1,'2014-03-15 00:00:00',1)
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
  `movement_type_code` varchar(255) DEFAULT NULL,
  `type` bit(1) DEFAULT NULL,
  `movement_type_label` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movements_types`
--

LOCK TABLES `movements_types` WRITE;
/*!40000 ALTER TABLE `movements_types` DISABLE KEYS */;
INSERT INTO `movements_types` VALUES (1,'1','','label_input'),(2,'2','\0','label_output');
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
  `notifications_bloodTypeABO` int(11) DEFAULT NULL,
  `notifications_bloodTypeRH` int(11) DEFAULT NULL,
  `notifications_messageSendOption` varchar(255) DEFAULT NULL,
  `notifications_bloodType` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_lrc5l6mjtbia1pn5mvhnwvwra` (`notifications_bloodTypeABO`),
  KEY `FK_5ymqnlrxqmpxqt9yo6ai16gq0` (`notifications_bloodTypeRH`),
  KEY `FK_p56jucpir963872t76g17e3dh` (`notifications_bloodType`),
  CONSTRAINT `FK_5ymqnlrxqmpxqt9yo6ai16gq0` FOREIGN KEY (`notifications_bloodTypeRH`) REFERENCES `blood_d_types_codes` (`blood_d_type_code_id`),
  CONSTRAINT `FK_lrc5l6mjtbia1pn5mvhnwvwra` FOREIGN KEY (`notifications_bloodTypeABO`) REFERENCES `blood_abo_types_codes` (`blood_abo_type_code_id`),
  CONSTRAINT `FK_p56jucpir963872t76g17e3dh` FOREIGN KEY (`notifications_bloodType`) REFERENCES `blood_types_codes` (`blood_type_code_id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notifications`
--

LOCK TABLES `notifications` WRITE;
/*!40000 ALTER TABLE `notifications` DISABLE KEYS */;
INSERT INTO `notifications` VALUES (2,'asdfa','dsafas',1,1,'1',NULL),(3,'Asunto','Mensaje',1,1,'1',NULL),(4,'sss','ffff',1,1,NULL,NULL),(5,'sss','aaa',1,1,NULL,NULL),(6,'holaaa','holaaa',1,1,NULL,NULL),(7,'hol ahlla','<span class=\"Apple-tab-span\" style=\"white-space:pre\">	</span>jfldsjnfdksj',NULL,NULL,NULL,NULL),(8,'holaaa','holaaa',NULL,NULL,NULL,NULL),(9,'s','ssss',NULL,NULL,NULL,NULL),(10,'ffff','fss',NULL,NULL,NULL,NULL),(11,'ss','aa',NULL,NULL,NULL,NULL),(12,'sss','sss',NULL,NULL,NULL,NULL),(13,'fff','ssss',NULL,NULL,NULL,NULL),(14,'f','fff',NULL,NULL,NULL,NULL),(15,'fff','sss',NULL,NULL,NULL,NULL),(16,'ss','sss',NULL,NULL,NULL,NULL),(17,'holaaa','fdnsiufdsiu',NULL,NULL,NULL,NULL),(18,'holaaaa','este en un mensaje para todos.',NULL,NULL,NULL,NULL),(19,'ff','ssss',NULL,NULL,NULL,NULL),(20,'fff','ssss',NULL,NULL,NULL,NULL),(21,'holaaaa','mensaje&nbsp;<div style=\"font-weight: normal;\"><br></div><div><span style=\"font-weight: bold;\">ajlkjf</span></div>',NULL,NULL,NULL,NULL),(22,'holaaa','otr<div style=\"font-weight: normal;\"><br></div><div><span style=\"font-weight: bold;\">vwexx</span></div>',NULL,NULL,NULL,NULL),(23,'ss','ss',NULL,NULL,NULL,6),(24,'ss','sss',NULL,NULL,NULL,6),(25,'sss','ssss',NULL,NULL,NULL,6),(26,'Holaaa','<span style=\"font-family: Arial, Verdana; font-size: 10pt;\">Esta buenisimooO!!!!</span><div style=\"font-family: Arial, Verdana; font-size: 10pt; font-style: normal; font-variant: normal; font-weight: normal; line-height: normal;\"><br></div><div><ul><li><span style=\"font-family: Arial, Verdana; font-size: 13.3333px;\">Primero</span></li><li><span style=\"font-family: Arial, Verdana; font-size: 13.3333px;\">Segundo</span></li></ul><div><span style=\"font-family: Arial, Verdana; font-size: 13.3333px;\"><br></span></div></div><div><span style=\"font-family: Arial, Verdana; font-weight: bold; font-size: x-large; color: rgb(204, 0, 0);\">Chau!!</span></div>',NULL,NULL,NULL,6),(27,'s','sss',NULL,NULL,NULL,NULL),(28,'sjfiosdj','fjsiojfd',NULL,NULL,NULL,NULL),(29,'ss','fff',NULL,NULL,NULL,NULL),(30,'ss','ss',NULL,NULL,NULL,NULL),(31,'sss','fff',NULL,NULL,'2',NULL),(32,'nknkj','njdnfkjsd',NULL,NULL,'2',NULL),(33,'','',NULL,NULL,'1',NULL),(34,'holaa','chauu',NULL,NULL,'1',NULL),(35,'huhiu','ufihsfiuds',NULL,NULL,NULL,NULL),(36,'habilitados','hfuidhius',NULL,NULL,'2',NULL),(37,'nadiee','fdsufhuds',NULL,NULL,'2',8),(38,'ab+','fsdnfsdhuif',NULL,NULL,NULL,6),(39,'fsfsfd','fdsfd',NULL,NULL,'2',6),(40,'holaa','fdhisufhdu',NULL,NULL,NULL,NULL);
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
  `notification_person_sended` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_notifications_persons_persons1_idx` (`persons_id`),
  KEY `fk_notifications_persons_notifications1_idx` (`notifications_id`),
  CONSTRAINT `fk_notifications_persons_notifications1` FOREIGN KEY (`notifications_id`) REFERENCES `notifications` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_notifications_persons_persons1` FOREIGN KEY (`persons_id`) REFERENCES `persons` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notifications_persons`
--

LOCK TABLES `notifications_persons` WRITE;
/*!40000 ALTER TABLE `notifications_persons` DISABLE KEYS */;
INSERT INTO `notifications_persons` VALUES (1,1,20,2),(2,2,20,2),(3,1,22,2),(4,1,25,2),(5,1,26,2),(6,1,27,2),(7,2,27,2),(8,1,28,2),(9,2,28,2),(10,1,29,2),(11,2,29,2),(12,1,30,2),(13,2,30,2),(14,2,31,2),(15,2,32,2),(16,2,33,2),(17,2,34,2),(18,1,35,2),(19,2,35,2),(20,2,36,2),(21,1,38,2),(22,1,40,2),(23,2,40,2);
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
  `person_first_name` varchar(100) NOT NULL,
  `person_second_name` varchar(100) DEFAULT '',
  `person_first_lastname` varchar(100) NOT NULL,
  `person_second_lastname` varchar(45) DEFAULT '',
  `person_birthday` date DEFAULT NULL,
  `person_address` varchar(100) DEFAULT NULL,
  `person_telephone` varchar(45) DEFAULT NULL,
  `person_city` bigint(20) DEFAULT NULL,
  `person_allow_notification_able` bit(1) DEFAULT 1,
  `person_allow_notification_need_donor` bit(1) DEFAULT 1,
  `person_state` int(11) DEFAULT NULL,
  `person_email` varchar(255) DEFAULT NULL,
  `person_zip_code` varchar(255) DEFAULT NULL,
  `person_gender` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_persons_1_idx` (`person_city`),
  KEY `FK_93gbkahb01kjcuxxpdqsanrdc` (`person_state`),
  KEY `FK_3pfkwjgp3e3fmvdjfswpdr99d` (`person_gender`),
  CONSTRAINT `FK_3pfkwjgp3e3fmvdjfswpdr99d` FOREIGN KEY (`person_gender`) REFERENCES `gender_code` (`gender_code_id`),
  CONSTRAINT `FK_93gbkahb01kjcuxxpdqsanrdc` FOREIGN KEY (`person_state`) REFERENCES `states_codes` (`state_id`),
  CONSTRAINT `fk_persons_1` FOREIGN KEY (`person_city`) REFERENCES `cities_codes` (`city_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons` VALUES (1,'Paula','','Roche','De Polsi','1989-10-14','Rivera 2711','099358717',1,'','',1,'pula14@gmail.com','11900',2),(2,'Bruno','Guillermo','Strasser','Mazza','1990-02-10','Gonzalo Ramirez 678','099567345',1,'','',NULL,'pula14@gmail.com',NULL,1);
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
  `persons_record_cda_extension` varchar(255) DEFAULT NULL,
  `persons_record_cda_root` varchar(255) DEFAULT NULL,
  `person_record_identification_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons_records`
--

-- LOCK TABLES `persons_records` WRITE;
-- /*!40000 ALTER TABLE `persons_records` DISABLE KEYS */;
-- INSERT INTO `persons_records` VALUES (1,1,'1','2.16.858.0.0.1.10.2.3.1.1.1','1'),(2,1,'7','2.16.858.0.0.1.10.2.3.1.1.1','1'),(3,1,'11','2.16.858.0.0.1.10.2.3.1.1.1','1'),(4,1,'10','2.16.858.0.0.1.10.2.3.1.1.1','1');
-- /*!40000 ALTER TABLE `persons_records` ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Table structure for table `responsible_transfusion_person`
--

DROP TABLE IF EXISTS `responsible_transfusion_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `responsible_transfusion_person` (
  `id` varchar(255) NOT NULL,
  `person_center` int(11) DEFAULT NULL,
  `person` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_26kwnxvroh1xf8g4ri7lxstkv` (`person_center`),
  CONSTRAINT `FK_26kwnxvroh1xf8g4ri7lxstkv` FOREIGN KEY (`person_center`) REFERENCES `centers` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `responsible_transfusion_person`
--

LOCK TABLES `responsible_transfusion_person` WRITE;
/*!40000 ALTER TABLE `responsible_transfusion_person` DISABLE KEYS */;
INSERT INTO `responsible_transfusion_person` VALUES ('1',4,'1'),('2',4,'2');
/*!40000 ALTER TABLE `responsible_transfusion_person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `results_code`
--

DROP TABLE IF EXISTS `results_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `results_code` (
  `results_code_id` int(11) NOT NULL,
  `boolean_results_code_value` bit(1) DEFAULT NULL,
  `results_code_label` varchar(255) DEFAULT NULL,
  `results_code_value` varchar(255) DEFAULT NULL,
  `results_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`results_code_id`),
  KEY `FK_chfrfr1jwkav0xk6qv0xloxlo` (`results_code_snomed`),
  CONSTRAINT `FK_chfrfr1jwkav0xk6qv0xloxlo` FOREIGN KEY (`results_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
INSERT INTO `role` VALUES (1,'1','rol_nada');
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
-- Table structure for table `search_filter_codes`
--

DROP TABLE IF EXISTS `search_filter_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `search_filter_codes` (
  `search_filter_codes_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `search_filter_codes_label` varchar(255) DEFAULT NULL,
  `search_filter_codes_path` varchar(255) DEFAULT NULL,
  `search_filter_codes_sql` varchar(255) DEFAULT NULL,
  `search_filter_codes_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`search_filter_codes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `search_filter_codes`
--

LOCK TABLES `search_filter_codes` WRITE;
/*!40000 ALTER TABLE `search_filter_codes` DISABLE KEYS */;
INSERT INTO `search_filter_codes` VALUES (1,'transfusions_input_search_id','/ClinicalDocument/id/@extension',NULL,'1'),(2,'donations_result_table_header_document','/ClinicalDocument/recordTarget/patientRole/patient/id/@root',NULL,'2'),(3,'donation_date','/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value',NULL,'3'),(4,'label_bank','/ClinicalDocument/author/assignedAuthor/representedOrganization/id/@root',NULL,'4'),(5,'person_name','/ClinicalDocument/recordTarget/patientRole/patient/name',NULL,'5');
/*!40000 ALTER TABLE `search_filter_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sequencer`
--

DROP TABLE IF EXISTS `sequencer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sequencer` (
  `sequencer_code_id` int(11) NOT NULL,
  `sequencer_code_name` varchar(255) DEFAULT NULL,
  `sequencer_code_value` varchar(255) DEFAULT NULL,
  `sequencer_number` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`sequencer_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sequencer`
--

LOCK TABLES `sequencer` WRITE;
/*!40000 ALTER TABLE `sequencer` DISABLE KEYS */;
INSERT INTO `sequencer` VALUES (1,'Hemologica Cdas','2.16.858.0.0.1.10.2.3.1.1.1',77),(2,'Hemologica HC Cda','2.16.858.0.0.1.10.2.3.1.1.2',49);
/*!40000 ALTER TABLE `sequencer` ENABLE KEYS */;
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
INSERT INTO `states_codes` VALUES (1,1,'1','label_montevideo'),(2,1,'3','label_canelones'),(3,1,'3','label_maldonado'),(4,1,'4','label_rocha');
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfusion_events_codes`
--

LOCK TABLES `transfusion_events_codes` WRITE;
/*!40000 ALTER TABLE `transfusion_events_codes` DISABLE KEYS */;
INSERT INTO `transfusion_events_codes` VALUES (1,'1','label_viral_hepatitis',25),(2,'2','label_transfusional_hemosiderosis',26),(3,'3','label_abo_incompatibility_reaction',27),(4,'4','label_rh_incompatibility_reaction',28),(5,'5','label_febrile_reaction',29),(6,'6','label_allergic_reaction',30);
/*!40000 ALTER TABLE `transfusion_events_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transfusion_filter_codes`
--

DROP TABLE IF EXISTS `transfusion_filter_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transfusion_filter_codes` (
  `transfusion_filter_codes_id` int(11) NOT NULL,
  `transfusion_filter_codes_label` varchar(255) DEFAULT NULL,
  `transfusion_filter_codes_path` varchar(255) DEFAULT NULL,
  `transfusion_filter_codes_sql` varchar(255) DEFAULT NULL,
  `transfusion_filter_codes_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`transfusion_filter_codes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfusion_filter_codes`
--

LOCK TABLES `transfusion_filter_codes` WRITE;
/*!40000 ALTER TABLE `transfusion_filter_codes` DISABLE KEYS */;
INSERT INTO `transfusion_filter_codes` VALUES (2,'label_age_from','/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value',NULL,'2'),(3,'label_age_to','/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value',NULL,'3'),(4,'label_gender','/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code','select gender_code_value, gender_code_label from gender_code;','4'),(5,'label_adverse_events','/ClinicalDocument/component/structuredBody/component/section/entry/observation/entryRelationship/observation/code/@code','select b.concept_code , a.transfusion_event_code_label from transfusion_events_codes as a join concepts as b on a.transfusion_event_code_snomed = b.id;','5'),(6,'label_severity','/ClinicalDocument//component//structuredBody//component//section//entry//observation//$1//interpretationCode//@code','select b.concept_code , a.event_severity_code_label from event_severity_code as a join concepts as b on a.event_severity_code_snomed = b.id;','6'),(7,'label_product','/ClinicalDocument//component//structuredBody//component//section//entry//procedure//entryRelationship[descendant-or-self::node()/@typeCode = \"COMP\"]//observation//@code','select b.concept_code , a.unit_type_code_label from units_types as a join concepts as b on a.unit_type_code_snomed = b.id;','1');
/*!40000 ALTER TABLE `transfusion_filter_codes` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfusion_laboratory_codes`
--

LOCK TABLES `transfusion_laboratory_codes` WRITE;
/*!40000 ALTER TABLE `transfusion_laboratory_codes` DISABLE KEYS */;
INSERT INTO `transfusion_laboratory_codes` VALUES (1,'1','label_direct_coombs',23),(2,'2','label_indirect_coombs',24);
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
  -- `unit_institution_id` int(11) NOT NULL,
  `unit_institution_center_id` int(11) DEFAULT NULL,
  `unit_type` int(11) NOT NULL,
  `unit_institution_code` varchar(100) NOT NULL,
  `unit_state` bit(1) DEFAULT NULL,
  `blood_abo_type` bigint(20) DEFAULT NULL,
  `blood_rh_type` bigint(20) DEFAULT NULL,
  `unit_parent` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  -- KEY `fk_units_1_idx` (`unit_institution_id`),
  KEY `fk_units_2_idx` (`unit_institution_center_id`),
  KEY `fk_units_3_idx` (`unit_type`),
  KEY `FK_aafagm6sbysbeivuxb75whi60` (`unit_parent`),
  CONSTRAINT `FK_aafagm6sbysbeivuxb75whi60` FOREIGN KEY (`unit_parent`) REFERENCES `units` (`id`),
  CONSTRAINT `FK_nfjfl73elb2iogfec5m27w89q` FOREIGN KEY (`unit_institution_center_id`) REFERENCES `institutions` (`id`),
  -- CONSTRAINT `fk_units_1` FOREIGN KEY (`unit_institution_id`) REFERENCES `institutions` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_units_2` FOREIGN KEY (`unit_institution_center_id`) REFERENCES `centers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_units_3` FOREIGN KEY (`unit_type`) REFERENCES `units_types` (`unit_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `units`
--

LOCK TABLES `units` WRITE;
/*!40000 ALTER TABLE `units` DISABLE KEYS */;
-- INSERT INTO `units` VALUES (1,'1',1,1,1,'1',NULL,NULL,NULL,NULL);
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
  `unit_type_code_label` varchar(255) DEFAULT NULL,
  `unit_type_code_value` varchar(255) DEFAULT NULL,
  `unit_type_code_snomed` int(11) DEFAULT NULL,
  PRIMARY KEY (`unit_type_id`),
  KEY `FK_1es6c45nvrtsd5duwibi1w96w` (`unit_type_code_snomed`),
  CONSTRAINT `FK_1es6c45nvrtsd5duwibi1w96w` FOREIGN KEY (`unit_type_code_snomed`) REFERENCES `concepts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
  `id` int(11) NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  `persons_id` varchar(255) DEFAULT NULL,
  `active_account` bit(1) DEFAULT NULL,
  `active_account_token` varchar(255) DEFAULT NULL,
  `active_account_token_time` datetime DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `password_reset` bit(1) DEFAULT NULL,
  `password_reset_token` varchar(255) DEFAULT NULL,
  `password_reset_token_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'1','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_role_services`
--

DROP TABLE IF EXISTS `users_role_services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_role_services` (
  `id` bigint(20) NOT NULL,
  `center_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_2v7tnjo2wi6ads2jfc85r9wul` (`center_id`),
  KEY `FK_mu40tv2h82hbvkhi59b228nlw` (`role_id`),
  KEY `FK_5o4ppdojg8dgttitldhlr8gyf` (`user_id`),
  CONSTRAINT `FK_2v7tnjo2wi6ads2jfc85r9wul` FOREIGN KEY (`center_id`) REFERENCES `centers` (`id`),
  CONSTRAINT `FK_5o4ppdojg8dgttitldhlr8gyf` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `FK_mu40tv2h82hbvkhi59b228nlw` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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

-- Dump completed on 2016-01-18 19:09:29
