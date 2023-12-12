-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram to familiarize yourself with
-- the table and column names to write accurate queries and get the appropriate
-- answers.

-- Run Query: Find all the invoices whose total is between $5 and $15 dollars.

SELECT
    Total
FROM
    Invoice
WHERE
    Total BETWEEN 5 AND 15
;
