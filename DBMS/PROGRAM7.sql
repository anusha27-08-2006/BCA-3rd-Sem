mysql> USE college;
Database changed
mysql> CREATE VIEW bca_student AS
    -> SELECT id,name,marks
    -> FROM student
    -> WHERE department='BCA';
Query OK, 0 rows affected (0.08 sec)

mysql> SELECT * FROM bca_student;
+----+-------+-------+
| id | name  | marks |
+----+-------+-------+
|  1 | Akash |    85 |
|  2 | Ravi  |    75 |
|  4 | Manoj |    60 |
|  6 | Kiran |    95 |
+----+-------+-------+
4 rows in set (0.00 sec)

mysql> CREATE VIEW high_marks AS
    -> SELECT id,name,marks
    -> FROM student
    -> WHERE marks>80;
Query OK, 0 rows affected (0.05 sec)

mysql> SELECT * FROM high_marks;
+----+-------+-------+
| id | name  | marks |
+----+-------+-------+
|  1 | Akash |    85 |
|  3 | Priya |    90 |
|  6 | Kiran |    95 |
+----+-------+-------+
3 rows in set (0.00 sec)

mysql> CREATE OR REPLACE VIEW bca_student AS
    -> SELECT id,name,marks,city
    -> FROM student
    -> WHERE department='BCA';
Query OK, 0 rows affected (0.10 sec)

mysql> DROP VIEW bca_student;
Query OK, 0 rows affected (0.09 sec)

mysql>