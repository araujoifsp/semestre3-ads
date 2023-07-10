-- MySQL Script generated by MySQL Workbench
-- Fri Feb 24 20:13:52 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`prodctsLines`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`prodctsLines` (
  `productLine` INT NOT NULL,
  `textDescription` VARCHAR(45) NULL,
  `htmlDescription` VARCHAR(50) NULL,
  `prodctsLinescol` VARCHAR(45) NULL,
  `image` VARCHAR(45) NULL,
  PRIMARY KEY (`productLine`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`products` (
  `productCode` INT NOT NULL,
  `productName` VARCHAR(45) NOT NULL,
  `productLine` VARCHAR(45) NULL,
  `productScale` VARCHAR(45) NULL,
  `productVendor` VARCHAR(45) NULL,
  `productDesciption` VARCHAR(45) NULL,
  `quantityInStock` INT NOT NULL,
  `buyPrice` VARCHAR(45) NULL,
  `MSRP` VARCHAR(45) NULL,
  `prodctsLines_productLine` INT NOT NULL,
  PRIMARY KEY (`productCode`),
  INDEX `fk_products_prodctsLines_idx` (`prodctsLines_productLine` ASC) VISIBLE,
  CONSTRAINT `fk_products_prodctsLines`
    FOREIGN KEY (`prodctsLines_productLine`)
    REFERENCES `mydb`.`prodctsLines` (`productLine`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;