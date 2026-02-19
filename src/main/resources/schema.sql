CREATE TABLE IF NOT EXISTS `public`.`accounts`
(
    `id` INT NOT NULL AUTO_INCREMENT,
    `alias` VARCHAR(45) NOT NULL,
    `pass` VARCHAR(45) NOT NULL,
    `active` INT NOT NULL,
    PRIMARY KEY (`id`)
    );

CREATE TABLE IF NOT EXISTS `public`.`roles`
(
    `id` INT NOT NULL AUTO_INCREMENT,
    `alias` VARCHAR(45) NOT NULL,
    `role` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`)
    );