-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram to familiarize yourself with
-- the table and column names to write accurate queries and get the appropriate
-- answers.

-- Run Query: Find all the invoices for customer 56 and 58 where the total was
-- between $1.00 and $5.00.

SELECT
    *
FROM
    Invoice
WHERE
    CustomerId IN (56, 58) AND (Total BETWEEN 1.00 AND 5.00)
;
