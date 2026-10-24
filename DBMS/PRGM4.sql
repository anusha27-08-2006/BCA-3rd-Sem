TO EXECUTE DCL AND TCL COMMANDS 
 
CREATE DATABASE CityDB; 
 
USE CityDB; 

CREATE TABLE Cities ( 
    ID INT, 
    name VARCHAR(20), 
    city VARCHAR(10), 
    contact BIGINT 
  ); 
 
INSERT INTO Cities VALUES 
(1, 'Ramesh', 'Bangalore', 9876543210), 
(2, 'Priya', 'Mysore', 9876543211), 
(3, 'Suresh', 'Tumkur', 9876543212), 
(4, 'Anu', 'Hassan', 9876543213), 
(5, 'Kiran', 'Mandya', 9876543214); 
 
SELECT * FROM Cities; 
  
START TRANSACTION; 
 
UPDATE Cities 
SET city = 'Bengaluru' 
WHERE ID = 1; 
 
SELECT * FROM Cities; 
 
COMMIT; 
 
SELECT * FROM Cities; 
START TRANSACTION; 
 
UPDATE Cities 
SET contact = 9000000000 
WHERE ID = 2; 
 
SELECT * FROM Cities; 
 
START TRANSACTION; 
 
UPDATE Cities 
SET city = 'Chennai' 
WHERE ID = 3; 
 
SELECT * FROM Cities;

SAVEPOINT sp1; 
 
UPDATE Cities 
SET city = 'Delhi' 
WHERE ID = 4; 
 
SELECT * FROM Cities; 
SAVEPOINT sp2; 
  
UPDATE Cities 
SET city = 'Mumbai' 
WHERE ID = 5; 
 
SELECT * FROM Cities; 
 
ROLLBACK TO SAVEPOINT sp1; 
 
SELECT * FROM Cities; 
 
COMMIT; 
 
START TRANSACTION; 
 
UPDATE Cities 
SET city = 'Chennai' 
WHERE ID = 3; 
 
SAVEPOINT sp1; 
UPDATE Cities 
SET city = 'Delhi' 
WHERE ID = 4; 
 
SAVEPOINT sp2; 
 
UPDATE Cities 
SET city = 'Mumbai' 
WHERE ID = 5; 
 
ROLLBACK TO SAVEPOINT sp1; 
 
SELECT * FROM Cities; 
 
CREATE USER IF NOT EXISTS 'cityuser1'@'localhost' 
IDENTIFIED BY 'City@1234'; 
 
GRANT SELECT, INSERT 
ON CityDB.Cities 
TO 'cityuser1'@'localhost'; 
SHOW GRANTS FOR 'cityuser1'@'localhost'; 
 

REVOKE INSERT 
ON CityDB.Cities 
FROM 'cityuser1'@'localhost'; 
 
SHOW GRANTS FOR 'cityuser1'@'localhost'; 
 
 
