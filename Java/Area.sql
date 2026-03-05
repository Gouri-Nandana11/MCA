SET SERVEROUTPUT ON;

DECLARE
    radius NUMBER := &radius;
    area   NUMBER;
BEGIN
    area := 3.14 * radius * radius;
    DBMS_OUTPUT.PUT_LINE('Area of Circle = ' || area);
END;
/

