SELECT *
FROM players
JOIN countries
ON players.country_id = countries.id
where countries.name = "Japan"
AND height >= 180 ;