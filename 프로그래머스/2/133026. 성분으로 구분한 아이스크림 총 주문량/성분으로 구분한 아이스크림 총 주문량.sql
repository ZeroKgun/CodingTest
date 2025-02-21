-- 코드를 입력하세요
SELECT i.INGREDIENT_TYPE, SUM(f.TOTAL_ORDER) AS TOTAL_ORDER FROM FIRST_HALF AS f
JOIN ICECREAM_INFO AS i ON f.FLAVOR = i.FLAVOR
GROUP BY i.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER;