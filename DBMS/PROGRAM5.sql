mysql> USE college;
Database changed
mysql> INSERT INTO student VALUES
    -> (1,'Akash','BCA',85,'Koppal'),
    -> (2,'Ravi','BCA',75,'Gangavathi'),
    -> (3,'Priya','BCom',90,'Koppal'),
    -> (4,'Manoj','BCA',60,'Yelburga'),
    -> (6,'Kiran','BCA',95,'Gangavathi');
Query OK, 5 rows affected (0.06 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM student
    -> WHERE marks>(SELECT AVG(marks)FROM student);
+----+-------+------------+-------+------------+
| id | name  | department | marks | city       |
+----+-------+------------+-------+------------+
|  1 | Akash | BCA        |    85 | Koppal     |
|  3 | Priya | BCom       |    90 | Koppal     |
|  6 | Kiran | BCA        |    95 | Gangavathi |
+----+-------+------------+-------+------------+
3 rows in set (0.01 sec)

mysql> SELECT * FROM student
    -> WHERE marks>(SELECT MAX(marks)FROM student);
Empty set (0.01 sec)

mysql> SELECT * FROM student
    -> WHERE marks=(SELECT MAX(marks)FROM student);
+----+-------+------------+-------+------------+
| id | name  | department | marks | city       |
+----+-------+------------+-------+------------+
|  6 | Kiran | BCA        |    95 | Gangavathi |
+----+-------+------------+-------+------------+
1 row in set (0.00 sec)

mysql> SELECT * FROM student
    -> WHERE department=(
    -> SELECT department
    -> FROM student
    -> WHERE name='Akash'
    -> );
+----+-------+------------+-------+------------+
| id | name  | department | marks | city       |
+----+-------+------------+-------+------------+
|  1 | Akash | BCA        |    85 | Koppal     |
|  2 | Ravi  | BCA        |    75 | Gangavathi |
|  4 | Manoj | BCA        |    60 | Yelburga   |
|  6 | Kiran | BCA        |    95 | Gangavathi |
+----+-------+------------+-------+------------+
4 rows in set (0.00 sec)

mysql> SELECT * FROM student
    -> WHERE marks>(
    -> SELECT marks
    -> FROM student
    -> WHERE name='Ravi'
    -> );
+----+-------+------------+-------+------------+
| id | name  | department | marks | city       |
+----+-------+------------+-------+------------+
|  1 | Akash | BCA        |    85 | Koppal     |
|  3 | Priya | BCom       |    90 | Koppal     |
|  6 | Kiran | BCA        |    95 | Gangavathi |
+----+-------+------------+-------+------------+
3 rows in set (0.00 sec)

mysql> SELECT MAX(marks)
    -> FROM student
    -> WHERE marks<(
    -> SELECT MAX(marks)
    -> FROM student
    -> );
+------------+
| MAX(marks) |
+------------+
|         90 |
+------------+
1 row in set (0.00 sec)

