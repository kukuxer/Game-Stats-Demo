
DROP TABLE IF EXISTS `games`;
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

INSERT INTO `games` VALUES (1,'Bahdan','Junya','L',0,6,'2024-02-13'),(2,'Junya','Bahdan','W',6,0,'2024-02-13'),(3,'Bahdan','Junya','L',2,6,'2024-02-13'),(4,'Junya','Bahdan','W',6,2,'2024-02-13'),(5,'Junya','nzar','W',6,0,'2024-02-13'),(6,'nzar','Junya','L',0,6,'2024-02-13'),(7,'Bahdan','Junya','L',4,6,'2024-02-14'),(8,'Junya','Bahdan','W',6,4,'2024-02-14'),(9,'Bahdan','Junya','W',6,2,'2024-02-14'),(10,'Junya','Bahdan','L',2,6,'2024-02-14'),(11,'Bahdan','Junya','L',2,6,'2024-02-15'),(12,'Junya','Bahdan','W',6,2,'2024-02-15'),(13,'Bahdan','nzar','W',6,2,'2024-02-16'),(14,'nzar','Bahdan','L',2,6,'2024-02-16'),(15,'Bahdan','nzar','W',6,1,'2024-02-16'),(16,'nzar','Bahdan','L',1,6,'2024-02-16'),(17,'Bahdan','Junya','L',3,6,'2024-02-18'),(18,'Junya','Bahdan','W',6,3,'2024-02-18'),(19,'Bahdan','Junya','L',2,6,'2024-02-18'),(20,'Junya','Bahdan','W',6,2,'2024-02-18'),(23,'Junya','Bahdan','W',7,5,'2024-02-22'),(24,'Bahdan','Junya','L',5,7,'2024-02-22'),(25,'Bahdan','Junya','L',4,6,'2024-02-23'),(26,'Junya','Bahdan','W',6,4,'2024-02-23'),(27,'Bahdan','nzar','W',6,1,'2024-02-25'),(28,'nzar','Bahdan','L',1,6,'2024-02-25'),(29,'Junya','nzar','W',6,2,'2024-02-27'),(30,'nzar','Junya','L',2,6,'2024-02-27'),(31,'Bahdan','Junya','L',2,6,'2024-02-28'),(32,'Junya','Bahdan','W',6,2,'2024-02-28'),(33,'Bahdan','Junya','W',6,2,'2024-03-02'),(34,'Junya','Bahdan','L',2,6,'2024-03-02'),(35,'Bahdan','Junya','L',2,6,'2024-03-02'),(36,'Junya','Bahdan','W',6,2,'2024-03-02'),(37,'Bahdan','Junya','L',1,6,'2024-03-02'),(38,'Junya','Bahdan','W',6,1,'2024-03-02'),(39,'Bahdan','Junya','L',3,6,'2024-03-04'),(40,'Junya','Bahdan','W',6,3,'2024-03-04'),(41,'Bahdan','Junya','L',2,6,'2024-03-08'),(42,'Junya','Bahdan','W',6,2,'2024-03-08'),(43,'Bahdan','Junya','L',4,6,'2024-03-09'),(44,'Junya','Bahdan','W',6,4,'2024-03-09');
