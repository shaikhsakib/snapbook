CREATE TABLE IF NOT EXISTS snapuser (
    `ID` INT,
    `FIRSTNAME` VARCHAR(6) CHARACTER SET utf8,
    `LASTNAME` VARCHAR(5) CHARACTER SET utf8,
    `EMAIL` VARCHAR(19) CHARACTER SET utf8,
    `MOBILE` INT,
    `PASSWORD` VARCHAR(8) CHARACTER SET utf8
);
INSERT INTO snapuser VALUES
    (1,'zaid','khan','zaidk9244@gmail.com',7710963319,'Mar@2014'),
    (2,'shaikh','sakib','zsakib17@gmail.com',123456789,'Mar@2014');
