---PROCEDURE
CREATE PROCEDURE a_plus_b(a integer, b integer)
    LANGUAGE SQL
AS
$$
    -- INSERT INTO tbl VALUES (a);
-- INSERT INTO tbl VALUES (b);
select a + b;
$$;

CALL a_plus_b(1, 2);