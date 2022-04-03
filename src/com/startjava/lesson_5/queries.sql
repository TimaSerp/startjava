SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status = 'Active';
SELECT * FROM Jaegers WHERE mark = '1' OR mark = '6';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch)FROM JAEGERS);
SELECT * FROM Jaegers WHERE killKaiju = (SELECT MIN(killKaiju)FROM JAEGERS) OR killKaiju = (SELECT MAX(killKaiju)FROM JAEGERS);
SELECT AVG(weight) FROM Jaegers;
UPDATE Jaegers SET killKaiju = killKaiju + 1 WHERE status = 'Active';
DELETE FROM Jaegers WHERE status = 'Destroyed';
