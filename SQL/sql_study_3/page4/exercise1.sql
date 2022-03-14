SELECT *
FROM countries
WHERE rank < (
  SELECT rank
  from countries
  where name = "Japan"
  
  
)
;