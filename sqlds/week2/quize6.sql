-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram to familiarize yourself with
-- the table and column names to write accurate queries and get the appropriate
-- answers.

-- Run Query: Find all the customer emails that start with "J" and are from gmail.com.

SELECT
    *
FROM
    Customer
WHERE
    Email LIKE 'J%gmail.com'
;
