CREATE TABLE CUSTOMERS
(
  ID        VARCHAR(40),
  NAME      VARCHAR(200),
  EMAIL     VARCHAR(100),
  BONUS     NUMERIC(4,2),
  CONSTRAINT "PK_CUSTOMERS"       PRIMARY KEY (ID),
  CONSTRAINT "NN_CUSTOMERS.NAME"  CHECK (NAME IS NOT NULL),
  CONSTRAINT "NN_CUSTOMERS.BONUS" CHECK (BONUS IS NOT NULL),
  CONSTRAINT "CH_CUSTOMERS.BONUS" CHECK (BONUS BETWEEN 0 AND 10)
);

CREATE SEQUENCE SEQ_CUSTOMERS MINVALUE 0 MAXVALUE 100000000 START WITH 1 INCREMENT BY 1;

INSERT INTO CUSTOMERS(ID,  NAME,              EMAIL,               BONUS)
               VALUES('A', 'Jorge Garcia',    'jgarcia@gmail.com', 8);
INSERT INTO CUSTOMERS(ID,  NAME,              EMAIL,               BONUS)
               VALUES('B', 'Manuela Perez',   'mperez@gmail.com',  7);
INSERT INTO CUSTOMERS(ID,  NAME,              EMAIL,               BONUS)
               VALUES('C', 'Luis Martin',     'lmartin@gmail.com', 6);
INSERT INTO CUSTOMERS(ID,  NAME,              EMAIL,               BONUS)
               VALUES('D', 'Javier Marcos',   'jmarcos@gmail.com', 4);
INSERT INTO CUSTOMERS(ID,  NAME,              EMAIL,               BONUS)
               VALUES('E', 'Trinidad Rivera', 'trivera@gmail.com', 5);
commit;                                                  