-- 동물 보호소에 들어온 동물 중 아픈 동물1의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.
-- 컬럼에 저장된 문자열 중에서 LIKE 연산자에서 지정한 문자 패턴과 부분적으로 일치하면 참이 되는 연산자
-- %sick면 sick로 끝나는 문자 sick%면 sick로 시작하는 문자
SELECT animal_id, name from animal_ins
where intake_condition like "%sick%"
order by animal_id