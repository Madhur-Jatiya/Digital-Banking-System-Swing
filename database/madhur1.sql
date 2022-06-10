-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: madhur1
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction` (
  `id` int NOT NULL AUTO_INCREMENT,
  `reciever_name` varchar(45) NOT NULL,
  `amount` decimal(60,0) NOT NULL,
  `userid` int NOT NULL,
  `date_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `type` varchar(45) DEFAULT 'user',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_user_id` (`userid`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`userid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES (1,'loki',100,13,'2022-06-05 13:02:33','user'),(2,'anu',1089,13,'2022-06-05 13:03:53','user'),(3,'mj',90,13,'2022-06-05 13:13:00','user'),(4,'madhur',1001,3,'2022-06-06 06:13:15','user'),(5,'lokesh',100,14,'2022-06-06 06:17:06','user'),(7,'nisha',90,4,'2022-06-06 11:01:00','user'),(8,'madhur',70,15,'2022-06-06 11:11:04','user'),(9,'pankaj',98328,3,'2022-06-06 23:53:36','user'),(10,'gaourav',7898,3,'2022-06-06 23:55:13','user'),(11,'aryan',909,3,'2022-06-06 23:56:54','user'),(12,'anurag',809,14,'2022-06-07 00:01:02','user'),(13,'aryan',788,3,'2022-06-07 00:01:23','user'),(14,'akash',10,15,'2022-06-07 00:01:54','user'),(15,'pandit',80,15,'2022-06-07 00:04:42','user'),(16,'madhur',10,2,'2022-06-07 00:17:20','user'),(17,'loki',1,3,'2022-06-07 00:26:45','user'),(18,'anurag',90,4,'2022-06-07 00:27:31','user'),(19,'akash',1,2,'2022-06-07 00:58:39','user'),(20,'pandit',1,2,'2022-06-07 01:02:13','user'),(21,'madhur',100,3,'2022-06-07 01:02:53','user'),(22,'madhur',9000,2,'2022-06-07 01:03:43','user'),(23,'madhur',7,15,'2022-06-07 01:50:20','user'),(24,'loki',6,15,'2022-06-07 01:50:55','user'),(25,'Shubham',100000,2,'2022-06-07 02:20:52','user'),(26,'shubahm',100000,2,'2022-06-07 02:21:12','user'),(27,'lokesh',1000000000,14,'2022-06-07 02:23:03','user'),(28,'pandit',100000,2,'2022-06-07 02:31:27','user'),(29,'xyz',909090,2,'2022-06-07 02:34:21','user'),(30,'hgfidbi',9090909,2,'2022-06-07 02:35:04','user'),(31,'hdb',109090,2,'2022-06-07 02:37:47','user'),(32,'jdnh',908080,2,'2022-06-07 02:38:49','user'),(33,'jdnhb',100000,2,'2022-06-07 02:40:36','user'),(34,'dnhs',100909,2,'2022-06-07 02:41:39','user'),(35,'gdb',100900,2,'2022-06-07 02:43:56','user'),(36,'fhjbj',749384,2,'2022-06-07 02:45:46','user'),(37,'raj',90,2,'2022-06-07 02:55:24','user'),(38,'shubham',90,2,'2022-06-07 03:01:59','user'),(39,'madhur',20,2,'2022-06-07 04:07:49','user'),(40,'Water',100,14,'2022-06-07 07:04:26','bill'),(41,'LPG gas',890,15,'2022-06-07 07:11:58','bill'),(42,'Telephone',1,14,'2022-06-07 07:14:37','bill'),(43,'Telephone',1,14,'2022-06-07 07:15:30','bill'),(44,'LPG gas',980,15,'2022-06-07 07:15:52','bill'),(45,'lokesh',5000,14,'2022-06-07 07:22:26','user'),(46,'Electricity',1000,14,'2022-06-07 07:23:07','bill'),(47,'LPG gas',1100,14,'2022-06-07 07:23:36','bill'),(48,'Water',100,14,'2022-06-07 07:23:57','bill'),(49,'akash',800,14,'2022-06-07 13:57:24','user'),(50,'madhur',100,16,'2022-06-07 14:05:33','user'),(51,'madhur',100,17,'2022-06-07 15:38:18','user'),(52,'Telephone',300,17,'2022-06-07 15:38:49','bill'),(53,'lokesh',500,17,'2022-06-07 15:47:00','user'),(54,'Water',150,17,'2022-06-07 15:47:44','bill'),(55,'Rahul',101,16,'2022-06-08 03:24:02','user'),(56,'Electricity',1000,16,'2022-06-08 03:24:44','bill'),(57,'Somu',10,16,'2022-06-08 03:25:42','user'),(58,'Water',100,3,'2022-06-10 00:32:42','bill'),(59,'madhur',1000,17,'2022-06-10 00:49:48','user'),(60,'Electricity',1,17,'2022-06-10 00:50:10','bill'),(61,'Telephone',579,4,'2022-06-10 01:15:52','bill');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `adharcard_number` varchar(45) NOT NULL,
  `account_balance` decimal(10,0) DEFAULT NULL,
  `gender` varchar(6) NOT NULL,
  `pin` varchar(45) DEFAULT NULL,
  `bank_name` varchar(45) DEFAULT 'Moms Bank Of India',
  `account_number` varchar(15) DEFAULT '32071520462',
  `ifsc_code` varchar(15) DEFAULT 'MBIN1234567',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `mobile_UNIQUE` (`mobile`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `adharcard_number_UNIQUE` (`adharcard_number`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (2,'loki','111','Lokesh','Nargesh','rajnargesh2912@gmail.com','8827729125','25-07-2000','Manawar, Dhar','782389290327',1300,'Male','0000','Moms Bank Of India','32830251825','MBIN3521734'),(3,'akash','1','Akash','Rohit','akash@gmail.com','5555555555','10-03-2001','Sagar, M.P.','727272727272',9999800,'Male','0000','Moms Bank Of India','32649856721','MBIN4532628'),(4,'aadi','@@aditya@@','Aditya','Jatiya','Aditya@gmail.com','7737957881','23/12/2005','Chhoti Sadri, Raj.','546378291003',2430,'Male','0000','Moms Bank Of India','32698437563','MBIN1234567'),(13,'junnu','8989','Jhankar','Gadhwal','junnu@gmail.com','6236790328','17-07-2001','Sanawad, Khargone','922389290327',56789,'female','0000','Moms Bank Of India','32874627878','MBIN3764021'),(14,'madhurmoms','123','Madhur','Jatiya','madhurmoms@gmail.com','9407192414','10/11/2001','Neemuch, M.P.','893290217483',9986000,'Male','0000','Moms Bank Of India','32674578396','MBIN1234567'),(15,'Anu','anu','Anurag','Jain','anuragjain2rr@gmail.com','3456789021','20/11/2001','Sagar, M.P.','345678902121',699000,'Male','1234','Moms Bank Of India','32647365748','MBIN6421476'),(16,'mahakal','shiv','nisha','jatiya','nisha@gmail.com','7773017471','07/05/1977','neemuch','123456789045',98790,'Female','1234','Moms Bank Of India','32746459873','MBIN3218921'),(17,'Sans','1234','Sanskriti','Maheshwari','sanskriti@gmail.com','3456789090','10-10-2001','Dhar','282389290327',8996999,'Female','1010','Moms Bank Of India','32473674637','MBIN3526532'),(18,'piyu','piyu','Supriya','Jatiya','supriyajha@gmail.com','6783429084','28-11-2002','lahan, Nepal','78923489032',789232,'Male','1010','Moms Bank Of India','32342743987','MBIN9846733'),(19,'rupali','rupa','Rupali','Solanki','rupali@gmail.com','8923467328','17-07-2001','Ghargone, M.P.','hfbyhebf',89478,'Female','0000','Moms Bank Of India','32143254436','MBIN9716369');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-10  7:40:04
