CREATE TABLE Hospital
(
    `hospital_id`    VARCHAR(20)     NOT NULL,
    `hospital_Name`  VARCHAR(20)     NOT NULL,
    `logo`           VARCHAR(255)    NULL,
    `addr`           VARCHAR(255)    NULL,
    `hospital_type`   VARCHAR(10)     NULL,
    `medical_person`  VARCHAR(5)      NULL,
    `tel`            VARCHAR(15)     NULL,
    `latitude`       VARCHAR(45)     NULL,
    `longitude`      VARCHAR(45)     NULL,
    PRIMARY KEY (hospital_id)
)default character set utf8 collate UTF8_GENERAL_CI;
CREATE TABLE Doctor
(
    `Doctor_Name`     VARCHAR(5)      NOT NULL,
    `Hospital_Name`   VARCHAR(20)     NULL,
    `Position`        VARCHAR(20)     NULL,
    `Detail_Data`     VARCHAR(255)    NULL,
    `Specialized`     VARCHAR(255)    NULL,
    `MedicalSubject`  VARCHAR(20)     NULL,
    `Age`             INT             NULL,
    PRIMARY KEY (Doctor_Name)
)default character set utf8 collate UTF8_GENERAL_CI;