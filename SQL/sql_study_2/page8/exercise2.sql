-- get the number of purchases by purchased_at and character_name

SELECT COUNT(*),purchased_at,character_name
FROM purchases
GROUP BY purchased_at,character_name
;
