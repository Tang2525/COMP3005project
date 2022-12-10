CREATE TABLE IF NOT EXISTS Books(
    title VARCHAR(30) NOT NULL,
    ISBN INT NOT NULL PRIMARY KEY,
    pages INT NOT NULL,
    price FLOAT NOT NULL,
    genre VARCHAR(30) NOT NULL,
    author VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS User(
    fullname VARCHAR(50) NOT NULL,
    userAddress VARCHAR(30),
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    accountType CHAR(1) 
);