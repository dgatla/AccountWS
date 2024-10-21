CREATE TABLE IF NOT EXISTS `customer`(
    `customer_id` int AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(100) NOT NULL,
    `email` varchar(100) NOT NULL,
    `mobile_number` varchar(10) NOT NULL,
    `create_dt` date not NULL,
    `created_by` varchar(20) NOT NULL,
    `updated_at` timestamp NOT NULL,
    `updated_by` varchar(20) NOT NULL
);