CREATE TABLE IF NOT EXISTS `customer`(
    `customer_id` long AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(100) NOT NULL,
    `email` varchar(100) NOT NULL,
    `mobile_number` varchar(10) NOT NULL,
    `created_at` timestamp not NULL,
    `created_by` varchar(20) NOT NULL,
    `updated_at` timestamp NOT NULL,
    `updated_by` varchar(20) NOT NULL
);


CREATE TABLE IF NOT EXISTS `account`(
     `customer_id` long not null,
     `account_id` long AUTO_INCREMENT PRIMARY KEY,
     `account_number` long,
     `account_type` varchar(20) NOT NULL,
     `branch_address` varchar(100) NOT NULL,
     `created_at` timestamp not NULL,
     `created_by` varchar(20) NOT NULL,
     `updated_at` timestamp NOT NULL,
     `updated_by` varchar(20) NOT NULL
);