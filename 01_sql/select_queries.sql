--1. 강의별 수강생 수 구하기
--각 강의 제목별로 수강한 수강생 수를 조회하시오.
--단, 수강생이 1명 이상인 강의만 조회하고, 수강생 수가 많은 순으로 정렬하시오.

SELECT LECTURE_TITLE,INDEX_COUNT
FROM LECTURE
WHERE INDEX_COUNT >= 1
ORDER BY 1;

--2특정 학생의 수강 내역 조회
--STUDENT_ID = 1001인 학생이 수강 중인 강의 제목, 강사 이름, 수강 상태를 조회하시오.
--수강 상태가 'Y'인 항목만 출력합니다.

SELECT LECTURE_TITLE, TEACHER_NAME, STATUS
FROM ENROLLMENT
JOIN LECTURE USING (LECTURE_ID)
JOIN TEACHER USING (TEACHER_ID)
WHERE STUDENT_ID = 30 AND STATUS = 'Y';

--3. 전공별 강의 개수 집계
--TEACHER 테이블의 전공(SUBJECT)별로 담당 중인 강의 개수를 구하시오.
--강의가 없는 전공 제외, 전공명 기준으로 오름차순..
SELECT SUBJECT ,COUNT(SUBJECT)  
FROM TEACHER
GROUP BY SUBJECT
HAVING SUBJECT IS NOT NULL
ORDER BY 1;

--4  평균 점수가 80점 이상인 강의만 조회
--각 강의별 수강생들의 GRADE_SCORE 평균을 계산한 후,
--평균 점수가 80점 이상인 강의의 제목과 평균 점수를 조회하시오.
--점수는 소수점 첫째 자리까지 출력하고, 평균 점수 내림차순으로 정렬하세요.
SELECT LECTURE_TITLE, AVG(GRADE_SCORE)
FROM LECTURE
JOIN ENROLLMENT USING (LECTURE_ID)
GROUP BY LECTURE_TITLE
ORDER BY AVG(GRADE_SCORE);

--5. 수강기록 등록 시, 강의별 수강 인원 수 자동 집계 트리거
--새로운 수강기록(ENROLLMENT)이 등록될 때마다,
--해당 강의(LECTURE)의 수강인원(INDEX_COUNT) 컬럼 값을 자동으로 1 증가시키는 트리거를 작성하시오.
--또한 수강기록이 삭제될 경우, 해당 값은 1 감소해야 한다.




