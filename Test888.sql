CREATE DATABASE `cnweb1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `faculty` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nameFaculty` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `cnweb1`.`faculty`
(`id`,
`nameFaculty`)
VALUES
(1,CNTT);
INSERT INTO `cnweb1`.`faculty`
(`id`,
`nameFaculty`)
VALUES
(2,DTVT);
INSERT INTO `cnweb1`.`faculty`
(`id`,
`nameFaculty`)
VALUES
(3,CK);
CREATE TABLE `sv` (
  `id` int NOT NULL AUTO_INCREMENT,
  `mssv` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `id_sv_faculty` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sv_falcuty_idx` (`id_sv_faculty`),
  CONSTRAINT `sv_falcuty` FOREIGN KEY (`id_sv_faculty`) REFERENCES `faculty` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `cnweb1`.`user`
(`id`,
`username`,
`password`)
VALUES
(1,'admin','123456');


