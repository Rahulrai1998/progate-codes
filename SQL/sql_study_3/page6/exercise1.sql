SELECT *
FROM players
-- Add a name to the combined table 
JOIN countries
-- Add a join condition
ON countries.id = players.country_id;