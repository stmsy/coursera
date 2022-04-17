-- All of the questions in this quiz refer to the open source Chinook Database.
-- Please familiarize yourself with the ER diagram to familiarize yourself with
-- the table and column names to write accurate queries and get the appropriate
-- answers.

-- Run Query: Find the albums with 12 or more tracks.

SELECT
    AlbumId
    , COUNT(*) AS NumTracks
FROM
    Track
GROUP BY
    AlbumId
HAVING
    NumTracks >= 12
;
