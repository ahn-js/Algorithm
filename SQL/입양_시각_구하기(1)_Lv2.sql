-- 시간만 추출해주는 HOUR()함수를 사용, COUNT를 할땐 ID도 괜찮고 *도 가능하다.
SELECT HOUR(datetime) AS '시간', COUNT(datetime) AS 'COUNT' from animal_outs
GROUP BY HOUR(datetime)
# HAVING 시간 >= 9 and 시간 < 20
HAVING 시간 BETWEEN 9 AND 19
ORDER BY HOUR(datetime);

-- Unknown column 'datetime' in 'having clause' 오류. alias로 지정해준 값을 HAVING에 적용하면 오류가 사라진다.
# SELECT HOUR(datetime) AS '시간', COUNT(datetime) AS 'COUNT' from animal_outs
# GROUP BY HOUR(datetime)
# HAVING HOUR(datetime) >= 9 and HOUR(datetime) < 20
# ORDER BY HOUR(datetime);