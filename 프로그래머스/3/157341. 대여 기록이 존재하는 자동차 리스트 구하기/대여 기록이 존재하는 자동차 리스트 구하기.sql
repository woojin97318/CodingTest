# CAR_RENTAL_COMPANY_CAR
# CAR_RENTAL_COMPANY_RENTAL_HISTORY H
# 자동차 종류가 '세단'인 자동차
# 10월에 대여를 시작한 기록이 있는 자동차
# 자동차 ID 리스트는 중복이 없어야 하며
# 자동차 ID를 기준으로 내림차순

SELECT C.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR C
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H
ON C.CAR_ID = H.CAR_ID AND MONTH(H.START_DATE) = 10
WHERE C.CAR_TYPE = '세단'
GROUP BY C.CAR_ID
ORDER BY C.CAR_ID DESC