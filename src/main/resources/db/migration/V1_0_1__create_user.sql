CREATE TABLE USER (
    USER_ID VARCHAR(36) NOT NULL,
    NAME VARCHAR(255) NOT NULL,
    MAIL_ADDRESS VARCHAR(255) NOT NULL,
    CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);