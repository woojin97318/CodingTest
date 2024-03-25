# 자동차 대여 기록 정보
# 대여 시작일을 기준 2022-08부터 2022-10까지 총 대여 횟수가 5회 이상인 자동차
# 해당 기간 동안의 월별 자동차 ID 별 총 대여 횟수(컬럼명: RECORDS)
# 월을 기준으로 오름차순
# 자동차 ID를 기준으로 내림차순
# 총 대여 횟수가 0인 경우에는 결과에서 제외

SELECT
    MONTH(START_DATE) AS 'MONTH',
    CAR_ID,
    COUNT(CAR_ID) AS 'RECORDS'
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE
    CAR_ID IN (SELECT CAR_ID
               FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
               WHERE YEAR(START_DATE) = 2022
               AND MONTH(START_DATE) BETWEEN 8 AND 10
               GROUP BY CAR_ID
               HAVING COUNT(*) >= 5)
    AND YEAR(START_DATE) = 2022
    AND MONTH(START_DATE) BETWEEN 8 AND 10
GROUP BY
    MONTH(START_DATE), CAR_ID
ORDER BY
    1, 2 DESC