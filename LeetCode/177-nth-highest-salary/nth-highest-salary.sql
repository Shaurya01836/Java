CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
    IF N <= 0 THEN
        RETURN;
    END IF;
  RETURN QUERY (
    -- Write your PostgreSQL query statement below.
    select distinct e.salary from Employee as e
    order by e.salary desc
    offset N-1 limit 1
      
  );
END;
$$ LANGUAGE plpgsql;