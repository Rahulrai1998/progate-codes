SELECT players.name,countries.name
FROM players
JOIN countries
on countries.id = players.country_id;
