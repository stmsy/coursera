-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram to familiarize yourself with
-- the table and column names to write accurate queries and get the appropriate
-- answers.

-- Run Query: Show the number of orders placed by each customer (hint: this is
-- found in the invoices table) and sort the result by the number of orders in
-- descending order.

SELECT
    CustomerId
    , COUNT(*) AS NumOrders
FROM
    Invoice
GROUP BY
    CustomerId
ORDER BY NumOrders DESC
;

