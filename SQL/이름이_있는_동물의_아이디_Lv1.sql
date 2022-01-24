-- 동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.
-- asc, desc 오름차순, 내림차순으로 order by를 이용해서 출력 but 기본적으로 오름차순이기 때문에 이 문제에선 order by가 없어도 가능
SELECT animal_id from animal_ins
where name is not null
order by animal_id asc;