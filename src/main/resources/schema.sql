CREATE TABLE customer (
                        id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
                        firstname VARCHAR(40) NOT NULL,
                        lastname VARCHAR(40) NOT NULL,
                        birthdate DATE NOT NULL,
                        street VARCHAR(40),
                        streetnumber VARCHAR(8),
                        city VARCHAR(40),
                        zip VARCHAR(8)
);

CREATE TABLE employee (
                                username VARCHAR(25) PRIMARY KEY NOT NULL,
                                password VARCHAR(255) NOT NULL
);
