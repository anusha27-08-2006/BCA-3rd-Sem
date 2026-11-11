mysql> USE college;
Database changed
mysql> DELIMITER //
mysql> CREATE PROCEDURE display_students()
    -> BEGIN
    -> DECLARE finished INT DEFAULT 0;
    -> DECLARE sname VARCHAR(50);
    -> DECLARE cur CURSOR FOR
    -> SELECT name FROM student;
    -> DECLARE CONTINUE HANDLER FOR NOT FOUND
    -> SET finished = 1;
    -> OPEN cur;
    -> read_loop:LOOP
    -> FETCH cur INTO sname;
    -> IF finished = 1 THEN
    -> LEAVE read_loop;
    -> END IF;
    -> SELECT sname AS Student_Name;
    -> END LOOP;
    -> CLOSE cur;
    -> END //
Query OK, 0 rows affected (0.14 sec)

mysql> DELIMITER ;
mysql> CALL display_students();
+--------------+
| Student_Name |
+--------------+
| Akash        |
+--------------+
1 row in set (0.04 sec)

+--------------+
| Student_Name |
+--------------+
| Ravi         |
+--------------+
1 row in set (0.04 sec)

+--------------+
| Student_Name |
+--------------+
| Priya        |
+--------------+
1 row in set (0.04 sec)

+--------------+
| Student_Name |
+--------------+
| Manoj        |
+--------------+
1 row in set (0.04 sec)

+--------------+
| Student_Name |
+--------------+
| Anu          |
+--------------+
1 row in set (0.04 sec)

+--------------+
| Student_Name |
+--------------+
| Kiran        |
+--------------+
1 row in set (0.04 sec)

Query OK, 0 rows affected (0.04 sec)

