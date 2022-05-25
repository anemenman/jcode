--- create trigger on procedure
CREATE TRIGGER emp_audit
    INSTEAD OF INSERT OR UPDATE OR DELETE
    ON a
    FOR EACH ROW
EXECUTE PROCEDURE a_plus_b();