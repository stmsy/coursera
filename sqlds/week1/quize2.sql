-- Retrieve the FirstName, LastName, Birthdate, Address, City, and State from the Employees table.
SELECT
  FirstName
  , LastName
  , BirthDate
  , Address
  , City
  , State
FROM
  Employee
;

-- Which of the employees listed below has a birthdate of 3-3-1965?
SELECT
  FirstName
FROM
  Employee
WHERE
  BirthDate = '3-3-1965'
;
