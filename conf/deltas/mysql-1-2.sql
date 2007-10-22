ALTER TABLE CHANNEL ADD COLUMN LAST_MODIFIED TIMESTAMP DEFAULT CURRENT_TIMESTAMP

ALTER TABLE PERSON ADD COLUMN LAST_LOGIN TIMESTAMP DEFAULT CURRENT_TIMESTAMP

ALTER TABLE MESSAGE ADD COLUMN ATTACHMENT SMALLINT DEFAULT NULL

CREATE TABLE ATTACHMENT
    (ID VARCHAR(255) NOT NULL PRIMARY KEY,
     MESSAGE_ID VARCHAR(255) NOT NULL,
     DATA LONGBLOB,
     SIZE INTEGER,
     TYPE VARCHAR(40))
