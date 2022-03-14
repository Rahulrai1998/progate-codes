SELECT countries.name,SUM(goals)
FROM players
JOIN countries
ON countries.id=players.country_id
group by countries.name;

