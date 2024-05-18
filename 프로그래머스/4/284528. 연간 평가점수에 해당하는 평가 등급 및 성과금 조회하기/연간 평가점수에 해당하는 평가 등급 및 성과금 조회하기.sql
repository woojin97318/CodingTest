# 사원별 성과금 정보 조회
# 사번 기준으로 오름차순

SELECT
    E.EMP_NO
    , E.EMP_NAME
    , CASE
        WHEN SUM(G.SCORE) / 2 >= 96 THEN 'S'
        WHEN SUM(G.SCORE) / 2 >= 90 THEN 'A'
        WHEN SUM(G.SCORE) / 2 >= 80 THEN 'B'
        ELSE 'C'
    END AS 'GRADE'
    , CASE
        WHEN SUM(G.SCORE) / 2 >= 96 THEN E.SAL * 0.2
        WHEN SUM(G.SCORE) / 2 >= 90 THEN E.SAL * 0.15
        WHEN SUM(G.SCORE) / 2 >= 80 THEN E.SAL * 0.1
        ELSE 0
    END AS 'BONUS'
FROM HR_EMPLOYEES E
INNER JOIN HR_GRADE G
ON E.EMP_NO = G.EMP_NO
GROUP BY E.EMP_NO
ORDER BY E.EMP_NO