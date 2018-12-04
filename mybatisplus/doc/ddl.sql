CREATE TABLE `foo` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `create_time` datetime(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
