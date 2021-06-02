-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: employees
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (6,'Jeanold','Cenina','Jinuld','Jinuld@16','123 Rizal','09283440817'),(7,'Jovet','Montes','jovet123','Jovet123@','123 rizal','0927452816'),(8,'Jovet','Montes','jovet123','Jinuld12@',NULL,NULL),(9,'Jeanold','Cenina','Jinuld','Jinuld@16','123 rizal','213213'),(10,'jovet','montes','jovet','Jovet@123','123 ','qwrw'),(11,'dexter','bugaoan','dexter','Dexter12@','123','12312312'),(12,'asdasd','asdasd','asdasd','Jinuld@16','asdasd123','12312'),(13,'jhoven','roldan','jhoven','Jhoven@123','qwewq','123123'),(14,NULL,NULL,NULL,NULL,NULL,NULL),(15,'ramil','rosello','ramil','Ramil@123','asdasd1','12312'),(16,'ramil','rosello','ramil','Ramil@123','asdasd1','12312'),(17,'ramil','rosello','ramil','Ramil@123','asdasd1','12312'),(18,'ramil','rosello','ramil','Ramil@123','123 rizal','123123'),(19,'admin','admin','admin','Admin@123','asdasd','1123'),(20,'admin1','admin1','admin1','Admin@123','123 rizal','09272618'),(21,'admin2','admin2','admin2','Admin@123','asdasd','12321'),(22,'Jon Renzo','Policarpio','renzo','Renzo@123','Cainta','0927837651'),(23,'admin3','admin3','admin3','Admin@123','cainta rizal','0928736515');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-28 10:44:59
