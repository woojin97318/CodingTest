# 중고 거래 게시물을 3건 이상 등록한 사용자
# 전체 주소 -> 시, 도로명 주소, 상세 주소
# 전화번호 -> xxx-xxxx-xxxx

SELECT
    U.USER_ID,
    U.NICKNAME,
    CONCAT(U.CITY, ' ', U.STREET_ADDRESS1, ' ', U.STREET_ADDRESS2) AS '전체주소',
    CONCAT(LEFT(U.TLNO, 3), '-', SUBSTRING(U.TLNO, 4, 4), '-', RIGHT(U.TLNO, 4)) AS '전화번호'
FROM
    (SELECT WRITER_ID FROM USED_GOODS_BOARD GROUP BY WRITER_ID HAVING COUNT(*) >= 3) B
JOIN
    USED_GOODS_USER U
ON
    B.WRITER_ID = U.USER_ID
ORDER BY
    1 DESC