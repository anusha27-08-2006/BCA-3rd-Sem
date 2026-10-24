CREATE DATABASE EmployeeDB; 
 
USE EmployeeDB; 
CREATE TABLE Employee ( 
    EmpID INT, 
    EName VARCHAR(10), 
    Empsal INT 
); 
INSERT INTO Employee VALUES 
(101, 'Ramesh', 25000), 
(102, 'Priya', 30000), 
(103, 'Suresh', 20000), 
(104, 'Anu', 45000), 
(105, 'Kiran', 35000); 
 
SELECT * FROM Employee; 
SELECT EName 
FROM Employee 
WHERE Empsal = ( 
    SELECT MAX(Empsal) 
    FROM Employee 
); 
