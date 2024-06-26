SELECT
    PR.ID
    , CASE
        WHEN PR.RANK <= 0.25 THEN 'CRITICAL'
        WHEN PR.RANK <= 0.50 THEN 'HIGH'
        WHEN PR.RANK <= 0.75 THEN 'MEDIUM'
        ELSE 'LOW'
    END AS 'COLONY_NAME'
FROM (
    SELECT
        ID
        , PERCENT_RANK() OVER(ORDER BY SIZE_OF_COLONY DESC) AS 'RANK'
    FROM
        ECOLI_DATA
) PR
ORDER BY
    ID