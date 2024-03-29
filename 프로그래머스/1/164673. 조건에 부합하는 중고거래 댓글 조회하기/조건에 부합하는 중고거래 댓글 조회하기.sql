# SELECT B.TITLE, B.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
# FROM USED_GOODS_REPLY R
# JOIN USED_GOODS_BOARD B
# ON B.BOARD_ID = R.BOARD_ID
# WHERE R.CREATED_DATE LIKE '2022-10%'
# OR B.CREATED_DATE LIKE '2022-10%'
# ORDER BY R.CREATED_DATE, B.TITLE

SELECT B.TITLE, B.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_REPLY R, USED_GOODS_BOARD B
WHERE R.BOARD_ID = B.BOARD_ID
AND (R.CREATED_DATE LIKE '2022-10%' OR B.CREATED_DATE LIKE '2022-10%')
ORDER BY R.CREATED_DATE, B.TITLE