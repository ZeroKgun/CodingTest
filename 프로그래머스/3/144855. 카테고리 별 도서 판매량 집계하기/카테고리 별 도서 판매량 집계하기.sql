-- 코드를 입력하세요
SELECT b.CATEGORY, SUM(s.SALES) FROM BOOK AS b JOIN BOOK_SALES AS s
ON b.BOOK_ID = s.BOOK_ID
WHERE SALES_DATE LIKE '2022-01%'
GROUP BY b.CATEGORY
ORDER BY b.CATEGORY ASC;