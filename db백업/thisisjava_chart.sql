-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: thisisjava
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `chart`
--

DROP TABLE IF EXISTS `chart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chart` (
  `chartNum` int NOT NULL AUTO_INCREMENT,
  `date` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `ssn` varchar(20) DEFAULT NULL,
  `Symptom` varchar(100) DEFAULT NULL,
  `opinion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`chartNum`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chart`
--

LOCK TABLES `chart` WRITE;
/*!40000 ALTER TABLE `chart` DISABLE KEYS */;
INSERT INTO `chart` VALUES (1,'20220305','손유나','900930-2******','목 아픔','주사 한방'),(2,'20220307','손유나','900930-2******','두통','주사 두방'),(3,'20220308','손유나','900930-2******','코 막힘','주사 세방'),(4,'20220310','임총민','950124-1******','무릎 아픔','수술 요함'),(5,'20220311','임총민','950124-1******','허리 아픔','수술 요함'),(6,'20220313','서재원','930411-1******','성장통','게보린 처방'),(7,'20220313','서재원','930411-1******','악몽 꿈','안정제 처방'),(8,'20220318','안지훈','940722-1******','꾀병','곤장 한방'),(9,'20220319','안지훈','940722-1******','잦은 배고픔','고구마 한개'),(10,'20220320','남호용','930408-1******','조울증','아스피린 처방'),(11,'20220320','남호용','930408-1******','골절','부목'),(12,'20221212','남호용','930408-1******','ㅋㅋㅋ','ㅋㅋㅋ'),(13,'20221213','남호용','930408-1******','하하하','하하하'),(14,'20221212','남호용','930408-1******','흠','흠'),(17,'20221223','남호용','930408-1******','테스트	','테스트'),(18,'20221223','테스트','테스트','테스트','테스트');
/*!40000 ALTER TABLE `chart` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-26 12:25:26
