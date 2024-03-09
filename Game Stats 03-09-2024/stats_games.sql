-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: stats
-- ------------------------------------------------------
-- Server version	8.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `games`
--

DROP TABLE IF EXISTS `games`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `games` (
  `id` int NOT NULL AUTO_INCREMENT,
  `person` varchar(64) DEFAULT NULL,
  `played_against` varchar(64) DEFAULT NULL,
  `result` varchar(16) DEFAULT NULL,
  `my_score` int DEFAULT NULL,
  `opponent_score` int DEFAULT NULL,
  `timer` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `games`
--

LOCK TABLES `games` WRITE;
/*!40000 ALTER TABLE `games` DISABLE KEYS */;
INSERT INTO `games` VALUES (1,'Bahdan','Junya','L',0,6,'2024-02-13'),(2,'Junya','Bahdan','W',6,0,'2024-02-13'),(3,'Bahdan','Junya','L',2,6,'2024-02-13'),(4,'Junya','Bahdan','W',6,2,'2024-02-13'),(5,'Junya','nzar','W',6,0,'2024-02-13'),(6,'nzar','Junya','L',0,6,'2024-02-13'),(7,'Bahdan','Junya','L',4,6,'2024-02-14'),(8,'Junya','Bahdan','W',6,4,'2024-02-14'),(9,'Bahdan','Junya','W',6,2,'2024-02-14'),(10,'Junya','Bahdan','L',2,6,'2024-02-14'),(11,'Bahdan','Junya','L',2,6,'2024-02-15'),(12,'Junya','Bahdan','W',6,2,'2024-02-15'),(13,'Bahdan','nzar','W',6,2,'2024-02-16'),(14,'nzar','Bahdan','L',2,6,'2024-02-16'),(15,'Bahdan','nzar','W',6,1,'2024-02-16'),(16,'nzar','Bahdan','L',1,6,'2024-02-16'),(17,'Bahdan','Junya','L',3,6,'2024-02-18'),(18,'Junya','Bahdan','W',6,3,'2024-02-18'),(19,'Bahdan','Junya','L',2,6,'2024-02-18'),(20,'Junya','Bahdan','W',6,2,'2024-02-18'),(23,'Junya','Bahdan','W',7,5,'2024-02-22'),(24,'Bahdan','Junya','L',5,7,'2024-02-22'),(25,'Bahdan','Junya','L',4,6,'2024-02-23'),(26,'Junya','Bahdan','W',6,4,'2024-02-23'),(27,'Bahdan','nzar','W',6,1,'2024-02-25'),(28,'nzar','Bahdan','L',1,6,'2024-02-25'),(29,'Junya','nzar','W',6,2,'2024-02-27'),(30,'nzar','Junya','L',2,6,'2024-02-27'),(31,'Bahdan','Junya','L',2,6,'2024-02-28'),(32,'Junya','Bahdan','W',6,2,'2024-02-28'),(33,'Bahdan','Junya','W',6,2,'2024-03-02'),(34,'Junya','Bahdan','L',2,6,'2024-03-02'),(35,'Bahdan','Junya','L',2,6,'2024-03-02'),(36,'Junya','Bahdan','W',6,2,'2024-03-02'),(37,'Bahdan','Junya','L',1,6,'2024-03-02'),(38,'Junya','Bahdan','W',6,1,'2024-03-02'),(39,'Bahdan','Junya','L',3,6,'2024-03-04'),(40,'Junya','Bahdan','W',6,3,'2024-03-04'),(41,'Bahdan','Junya','L',2,6,'2024-03-08'),(42,'Junya','Bahdan','W',6,2,'2024-03-08'),(43,'Bahdan','Junya','L',4,6,'2024-03-09'),(44,'Junya','Bahdan','W',6,4,'2024-03-09');
/*!40000 ALTER TABLE `games` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-09 14:12:08
