--�������� ��� �������
SELECT * FROM Jaegers;
--���������� ������ �� ������������ �������
SELECT * FROM Jaegers WHERE status = 'Active';
--���������� ������� ���������� �����, �������� Mark-1 � Mark-6
SELECT * FROM Jaegers WHERE mark = '1' OR mark = '6';
--������������ ������� �� �������� �� ������� mark
SELECT * FROM Jaegers ORDER BY mark DESC;
--���������� ������ ������� ������
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch)FROM JAEGERS);
--���������� �������, ������� ���������� ������/������ ���� kaiju
SELECT * FROM Jaegers WHERE killKaiju = (SELECT MIN(killKaiju)FROM JAEGERS) OR killKaiju = (SELECT MAX(killKaiju)FROM JAEGERS);
--���������� ������� ��� �������
SELECT AVG(weight) FROM Jaegers;
--��������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������
UPDATE Jaegers SET killKaiju = killKaiju +1 WHERE status = 'Active';
--������� ������������ �������
DELETE FROM Jaegers WHERE status = 'Destroyed';
