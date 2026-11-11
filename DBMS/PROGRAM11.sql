mysql> USE college;
Database changed
mysql> DELIMITER //
mysql> CREATE FUNCTION calculate_squar(n INT)
    -> RETURNS INT
    -> DETERMINISTIC
    -> BEGIN
    -> RETURN n * n;
    -> END //
Query OK, 0 rows affected (0.10 sec)

mysql> DELIMITER ;
mysql> SELECT calculate_squar(5);
+--------------------+
| calculate_squar(5) |
+--------------------+
|                 25 |
+--------------------+
1 row in set (0.01 sec)

mysql> DELIMITER //
mysql> CREATE FUNCTION total_marks(a INT, b INT, c INT)
    -> RETURNS INT
    -> DETERMINISTIC
    -> BEGIN
    -> RETURN a + b + c;
    -> END //
Query OK, 0 rows affected (0.07 sec)

mysql> DELIMITER ;
mysql> SELECT total_marks(80,85,90);
+-----------------------+
| total_marks(80,85,90) |
+-----------------------+
|                   255 |
+-----------------------+
1 row in set (0.00 sec)