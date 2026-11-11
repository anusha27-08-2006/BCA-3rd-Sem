mysql> CREATE TABLE employee(
    -> emp_id INT,
    -> emp_name VARCHAR(50),
    -> salary INT
    -> );
ERROR 1046 (3D000): No database selected
mysql> CREATE TABLE employee;
ERROR 1046 (3D000): No database selected
mysql> CREATE DATABASE employee;
ERROR 1007 (HY000): Can't create database 'employee'; database exists
mysql> DROP DATABASE employee;
Query OK, 0 rows affected (0.21 sec)

mysql> CREATE DATABASE employee;
Query OK, 1 row affected (0.14 sec)

mysql> USE employee;
Database changed
mysql> CREATE TABLE employee(
    -> emp_id INT,
    -> emp_name VARCHAR(50),
    -> salary INT
    -> );
Query OK, 0 rows affected (1.11 sec)

mysql> ALTER TABLE employee
    -> ADD department VARCHAR(30);
Query OK, 0 rows affected (1.09 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> ALTER TABLE employee
    -> MODIFY salary DECIMAL(10,2);
Query OK, 0 rows affected (1.56 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> RENAME TABLE employee TO staff;
Query OK, 0 rows affected (0.57 sec)

mysql> TRUNCATE TABLE staff;
Query OK, 0 rows affected (0.39 sec)

mysql> DROP TABLE staff;
Query OK, 0 rows affected (0.18 sec)

mysql>



