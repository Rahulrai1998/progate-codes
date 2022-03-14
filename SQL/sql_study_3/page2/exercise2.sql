SELECT name,goals
FROM players
where goals >(
SELECT AVG(goals)
from players
);


