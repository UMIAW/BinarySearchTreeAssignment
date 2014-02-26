CREATE DATABASE  IF NOT EXISTS `bookstore` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bookstore`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: bookstore
-- ------------------------------------------------------
-- Server version	5.6.15

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
-- Table structure for table `bookdetails`
--

DROP TABLE IF EXISTS `bookdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookdetails` (
  `IndexId` int(11) NOT NULL AUTO_INCREMENT,
  `ISBN` int(11) NOT NULL,
  `BookName` varchar(45) NOT NULL,
  `AuthorFName` varchar(45) NOT NULL,
  `AuthorLName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IndexId`),
  UNIQUE KEY `ISBN_UNIQUE` (`ISBN`),
  UNIQUE KEY `BookName_UNIQUE` (`BookName`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookdetails`
--

LOCK TABLES `bookdetails` WRITE;
/*!40000 ALTER TABLE `bookdetails` DISABLE KEYS */;
INSERT INTO `bookdetails` VALUES (13,66,'Core Java Volume I--Fundamentals','Cay','Horstmann'),(14,38,'Beginning Programming with Java For Dummies','Burd',''),(16,50,'Introduction to Java Programming','Daniel','Liang'),(18,40,'Effective Java (2nd Edition)','Daniel ','Liang'),(20,23,'Head First Java','Kathy','Sierra'),(21,35,'Starting Out with Java','Tony','Gaddis'),(22,76,'Murach\'s PHP and MySQL','Joel ','Murach'),(23,80,'PHP for the Web','Larry','Ullman'),(24,90,'The Joy of PHP','Alan','Forbes'),(26,45,'Effortless E-Commerce with PHP and MySQL ','Larry','Ullman'),(27,65,'Big Java Late Objects','Cay S','Horstmann'),(28,34,'PHP and MySQL in Easy Steps','Mike','McGrath'),(29,78,'Absolute Java (5th Edition)','Walter','Savitch'),(30,22,'Java Illuminated','Julie','Anderson'),(31,55,'Java Concurrency in Practice','Brian','Goetz'),(32,15,'Beginning PHP 5.3','Matt','Doyle'),(34,20,'PHP Cookbook','Adam','Adam Trachtenberg '),(35,69,'PHP Solutions','David','Powers'),(36,77,'PHP Objects, Patterns, and Practice','Matt','Zandstra'),(37,87,'Head First Design Patterns ','Elisabeth','Freeman'),(40,73,'PHP and MySQL for Dynamic Web Sites','Brian','Goetz');
/*!40000 ALTER TABLE `bookdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-02-26 10:30:58
