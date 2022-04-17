-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram to familiarize yourself with
-- the table and column names to write accurate queries and get the appropriate
-- answers.

-- Run Query: Find all the invoices from the billing city Brasília, Edmonton,
-- and Vancouver and sort in descending order by invoice ID.

SELECT
    *
FROM
    Invoice
WHERE
    BillingCity IN ('Brasília', 'Edmonton', 'Vancouver')
ORDER BY InvoiceId DESC
;
