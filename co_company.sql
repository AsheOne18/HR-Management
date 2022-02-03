CREATE TABLE `co_company` (
    `id` VARCHAR (40) NOT NULL COMMENT 'ID',
    `name` VARCHAR (255) NOT NULL COMMENT 'Company Name',
    `manager_id` VARCHAR (255) NOT NULL COMMENT 'Enterprise Login ID',
    `version` VARCHAR (255) NOT NULL COMMENT 'Current Version',
    `renewal_date` DATETIME DEFAULT NULL COMMENT 'Renewal Time',
    `expiration_date` DATETIME DEFAULT NULL COMMENT 'Expiration Date',
    `company_area` VARCHAR (255) DEFAULT NULL COMMENT 'Company Area',
    `company_address` TEXT DEFAULT NULL COMMENT 'Company Address',
    `business_license_id` VARCHAR(255) DEFAULT NULL COMMENT 'License Image ID',
    `legal_representative` VARCHAR (255) DEFAULT NULL COMMENT 'Legal Representative' ,
    `company_phone` TEXT DEFAULT NULL COMMENT 'Company Phone',
    `mailbox` VARCHAR (255) DEFAULT NULL COMMENT 'Email',
    `company_size` VARCHAR (255) DEFAULT NULL COMMENT 'Company Size',
    `industry` VARCHAR (255) DEFAULT NULL COMMENT 'Company Industry',
    `remarks` TEXT COMMENT 'Info Remarks',
    `audit_state` VARCHAR (255) DEFAULT NULL COMMENT 'Audit State',
    `state` TINYINT(2) NOT NULL DEFAULT '1' COMMENT 'Current State',
    `balance` DOUBLE NOT NULL COMMENT 'Current Balance',
    `create_time` DATETIME NOT NULL COMMENT 'Create Time'
)
