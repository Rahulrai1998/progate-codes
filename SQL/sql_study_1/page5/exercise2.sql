-- after "FROM purchases" add code to get rows that have "2018-10-10" in the "purchased_at" column

SELECT *
FROM purchases
where purchased_at = "2018-10-10";