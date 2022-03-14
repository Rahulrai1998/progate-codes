-- after "FROM purchases" add code to get rows where the "category" column is "food"
-- or the "character_name" column name is "Ken the Ninja"


SELECT *
FROM purchases
WHERE CATEGORY = "food"
OR character_name="Ken the Ninja";
