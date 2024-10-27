SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE,"%Y-%m-%d") AS OUT_DATE,
CASE
    WHEN OUT_DATE <= '2022-05-01' THEN '출고완료'
    WHEN OUT_DATE > '2022-05-01' THEN '출고대기'
    ELSE '출고미정'
END AS 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID;

SELECT order_id, product_id, date_format(out_date, '%Y-%m-%d') as out_date,
case 
    when out_date <= '2022-05-01' then '출고완료'
    when out_date is null then '출고미정'
    else '출고대기'
end as '출고여부'
from food_order
order by order_id asc