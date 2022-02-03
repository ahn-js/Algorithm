-- 여러 컬럼을 비교하여 조회할때 IN을 사용한다. 아니면 OR 로 모두 적어준다.
# SELECT animal_id, name, sex_upon_intake FROM animal_ins
# WHERE NAME = 'LUCY' OR NAME = 'ELLA' OR NAME = 'PICKLE' OR NAME = 'ROGAN' OR NAME = 'SABRINA' OR NAME = 'MITTY'
# ORDER BY animal_id

SELECT animal_id, name, sex_upon_intake FROM animal_ins
WHERE NAME IN ('LUCY', 'ELLA', 'PICKLE', 'ROGAN', 'SABRINA', 'MITTY')
ORDER BY animal_id