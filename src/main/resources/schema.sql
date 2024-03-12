CREATE TABLE customer (
                        id SERIAL PRIMARY KEY NOT NULL,
                        first_name VARCHAR(40) NOT NULL,
                        last_name VARCHAR(40) NOT NULL,
                        birthdate DATE NOT NULL,
                        street VARCHAR(40),
                        street_number VARCHAR(8),
                        city VARCHAR(40),
                        zip VARCHAR(8)
);

CREATE TABLE employee (
                                username VARCHAR(25) PRIMARY KEY NOT NULL,
                                role VARCHAR(25) NOT NULL,
                                password VARCHAR(255) NOT NULL
);

