select year(sales_date) YEAR ,month(sales_date) MONTH, GENDER, count(distinct(o.USER_ID)) USERS
from ONLINE_SALE o join USER_INFO u
on o.USER_ID = u.USER_ID
WHERE gender is not null
group by year(sales_date), month(sales_date), gender
ORDER BY YEAR, MONTH, GENDER