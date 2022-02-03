-- 쿼리문의 개수를 제한 할 때에는 LIMIT 사용 / ORDER BY가 LIMIT 보다 먼저 와야한다.
SELECT datetime FROM animal_ins
ORDER BY datetime
LIMIT 1