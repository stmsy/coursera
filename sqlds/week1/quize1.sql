-- For all of the questions in this quiz, we are using the Chinook database. All of the interactive code blocks have been
-- setup to retrieve data only from this database.

-- Retrieve all the records from the Employees table.
SELECT
  *
FROM
    Employee
WHERE
;

-- What is Robert King's mailing address? Note: You will have to scroll to the right in order to see it.
SELECT
    Address
FROM
    Employee
WHERE
    LastName = 'King' AND FirstName = 'Robert'
;

