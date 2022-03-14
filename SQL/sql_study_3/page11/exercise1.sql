SELECT name AS "player name" , height AS "height"
FROM players
where height > (
  SELECT AVG(height)
  FROM players
  
);