-- %y는 2자리수 년도, %Y는 4자리수 년도
SELECT animal_id, name, DATE_FORMAT(datetime, '%Y-%m-%d') FROM animal_ins
ORDER BY animal_id