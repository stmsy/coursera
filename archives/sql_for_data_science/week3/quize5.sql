-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram in order to familiarize
-- yourself with the table and column names in order to write accurate queries
-- and get the appropriate answers.

-- Find the name and ID of the artists who do not have albums.
SELECT
    ar.Name
    , ar.ArtistID
FROM
    Artist AS ar
    LEFT JOIN Album AS al
        ON ar.ArtistId = al.ArtistId
WHERE
    al.AlbumId IS NULL
;
