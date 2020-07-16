CREATE DATABASE crudtester;

USE crudtester;

CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO product (name, price) VALUES ("product1", 10);



DROP TABLE `product`;


select * From product;
