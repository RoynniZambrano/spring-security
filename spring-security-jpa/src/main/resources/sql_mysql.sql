

CREATE SCHEMA `springsecurity` ;

CREATE TABLE `springsecurity`.`user` (
  `id` INT NOT NULL,
  `user_name` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `roles` VARCHAR(45) NULL,
  `active` TINYINT NULL);



INSERT INTO `springsecurity`.`user`
(`id`,
`user_name`,
`password`,
`roles`,
`active`)
VALUES
(1,
'USER',
'pass',
'ROLE_USER',
true);