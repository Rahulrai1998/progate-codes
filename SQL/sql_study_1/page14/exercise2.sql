-- after "FROM purchases" add code to get rows where the "name" contains "pudding"

SELECT *
FROM purchases
WHERE NAME like "%pudding%";