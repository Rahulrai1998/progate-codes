-- after "FROM purchases" add code to get all rows where
-- the "name" column does not contain "pudding"

SELECT *
FROM purchases
where not name like "%pudding%";
