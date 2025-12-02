SELECT
    s.Score,
    COUNT(DISTINCT t.Score) AS `Rank`
FROM Scores s
JOIN Scores t
    ON s.Score <= t.Score
GROUP BY s.Id, s.Score
ORDER BY s.Score DESC;
