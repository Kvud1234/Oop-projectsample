show databases;
use logpage;
Select * from users;
CREATE TABLE users (
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    gender VARCHAR(10),
    birthday DATE,
    password VARCHAR(100)
);
select * from users;





