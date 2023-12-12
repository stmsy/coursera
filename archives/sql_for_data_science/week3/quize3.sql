-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram in order to familiarize
-- yourself with the table and column names in order to write accurate queries
-- and get the appropriate answers.

-- Retrieve the track name, album, artistID, and trackID for all the albums.
SELECT
    Name
    , Title
    , ArtistId
    , TrackId
FROM
    Track AS t
    LEFT JOIN Album AS a
        ON t.AlbumId = a.AlbumId
;
