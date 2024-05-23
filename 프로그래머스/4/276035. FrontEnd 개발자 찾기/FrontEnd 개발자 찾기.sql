WITH FRONT_SKILL AS (
    SELECT *
    FROM SKILLCODES
    WHERE CATEGORY = 'Front End'
)
SELECT DISTINCT D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
FROM DEVELOPERS D
INNER JOIN FRONT_SKILL F
ON D.SKILL_CODE & F.CODE
ORDER BY D.ID