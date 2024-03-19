SELECT
    COUNT(*) AS 'FISH_COUNT',
    FNI.FISH_NAME
FROM
    FISH_INFO FI
JOIN
    FISH_NAME_INFO FNI USING(FISH_TYPE)
GROUP BY
    FNI.FISH_NAME
ORDER BY
    FISH_COUNT DESC