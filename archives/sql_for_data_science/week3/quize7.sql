-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram in order to familiarize
-- yourself with the table and column names in order to write accurate queries
-- and get the appropriate answers.

-- See if there are any customers who have a different city listed in their
-- billing city versus their customer city.
SELECT
    i.BillingCity
    , c.City
FROM
    Invoice AS i
    LEFT JOIN Customer AS c
        ON i.CustomerId = c.CustomerId
WHERE
    i.BillingCity <> c.City
;
