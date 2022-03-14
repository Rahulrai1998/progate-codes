SELECT *
FROM players
LEFT JOIN teams
On players.previous_team_id = teams.id
;