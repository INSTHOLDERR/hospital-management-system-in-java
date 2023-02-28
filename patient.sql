/*
SQLyog Community Edition- MySQL GUI v8.03 
MySQL - 5.0.51a-community-nt : Database - patient
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`patient` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `patient`;

/*Table structure for table `patient` */

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient` (
  `id` varchar(100) NOT NULL,
  `patientname` varchar(100) default NULL,
  `dr` varchar(100) default NULL,
  `contactno` varchar(10) default NULL,
  `age` varchar(100) default NULL,
  `patientgender` varchar(100) default NULL,
  `bloodgroup` varchar(100) default NULL,
  `disease` varchar(100) default NULL,
  `address` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `patient` */

insert  into `patient`(`id`,`patientname`,`dr`,`contactno`,`age`,`patientgender`,`bloodgroup`,`disease`,`address`) values ('s','ssd','s','1111111111','111e','ed','ed','wr','ewretergrfhgjtyrehmgjtr');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
