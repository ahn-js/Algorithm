-- 동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL문을 작성해주세요. 이때 결과는 이름이 없는 동물은 집계에서 제외하며, 결과는 이름 순으로 조회해주세요.
-- 코드 결과가 오름차순으로 같게 출력되어도 정렬 순서를 정해준 대로 작성은 해야 정답으로 통과
SELECT name, COUNT(name) FROM animal_ins
GROUP BY name
HAVING name is not null and COUNT(name) >= 2
ORDER BY NAME ASC;