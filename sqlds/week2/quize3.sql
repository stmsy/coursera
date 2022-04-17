-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram to familiarize yourself with
-- the table and column names to write accurate queries and get the appropriate
-- answers.

-- Run Query: Find all the customers from the following States: RJ, DF, AB, BC,
-- CA, WA, NY.

SELECT
    *
FROM
    Customer
WHERE
    State IN ('RJ', 'DF', 'AB', 'BC', 'CA', 'WA', 'NY')
;
