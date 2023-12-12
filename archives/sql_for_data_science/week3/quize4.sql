-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram in order to familiarize
-- yourself with the table and column names in order to write accurate queries
-- and get the appropriate answers.

-- Retrieve a list with the managers last name, and the last name of the employees
-- who report to him or her.
SELECT
    e1.LastName
    , e2.LastName
FROM
    Employee AS e1
    LEFT JOIN Employee AS e2
        ON e1.EmployeeId = e2.ReportsTo
;
