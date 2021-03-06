CREATE TABLE `test` 
(
	`id` INT(8) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(25) NOT NULL DEFAULT '0',
	`age` INT(3) NOT NULL DEFAULT '0',
	`isAdmin` BIT(1) NOT NULL DEFAULT b'0',
	`createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci';


INSERT INTO `test` (`id`,`name`,`age`,`isAdmin`,`createdDate`) VALUES (1,"McKenzie",34,1,"2016-11-30 12:34:09"),(2,"John",55,0,"2017-05-18 18:50:01"),(3,"Athena",56,1,"2016-02-03 19:25:28"),(4,"Minerva",43,1,"2017-04-28 18:22:24"),(5,"Jonah",57,1,"2015-10-16 15:26:55"),(6,"Kermit",26,1,"2016-08-01 03:16:06"),(7,"Kennan",31,0,"2016-01-02 22:43:25"),(8,"Wayne",23,0,"2016-02-15 23:46:16"),(9,"Zephr",32,1,"2015-07-08 07:48:34"),(10,"Wing",40,0,"2016-12-26 07:01:38"),(11,"Mollie",34,1,"2015-06-22 16:34:17"),(12,"Abdul",38,0,"2015-05-21 04:08:39"),(13,"Sara",38,1,"2015-07-06 18:12:57"),(14,"Nash",25,0,"2016-09-18 04:48:00"),(15,"Kareem",27,1,"2016-05-29 05:12:15"),(16,"Kaden",51,0,"2016-07-27 17:39:25"),(17,"Thomas",24,1,"2016-04-16 02:34:50"),(18,"Linda",53,1,"2015-08-12 12:36:07"),(19,"Christopher",33,0,"2017-01-13 16:04:53"),(20,"Fredericka",57,1,"2015-11-25 00:17:24"),(21,"Ifeoma",40,0,"2017-05-04 15:07:07"),(22,"Solomon",59,0,"2016-01-20 09:12:17"),(23,"Octavia",44,1,"2016-04-18 21:18:42"),(24,"Pamela",55,1,"2015-09-01 18:26:38"),(25,"Haviva",43,0,"2016-05-25 15:02:56"),(26,"Noelle",46,1,"2015-07-09 19:06:15"),(27,"Jordan",42,1,"2016-09-19 16:38:26");