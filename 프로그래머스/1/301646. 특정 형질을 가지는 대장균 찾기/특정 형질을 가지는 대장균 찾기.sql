SELECT COUNT(ID) AS COUNT
FROM ECOLI_DATA
WHERE GENOTYPE & 2 = 0
  AND (GENOTYPE & 4 = 4 OR GENOTYPE & 1 = 1);

-- select count(id) from ECOLI_DATA where GENOTYPE & 2 = 0 and (GENOTYPE & 4 = 4 or GENOTYPE & 1 = 1);
-- SQL 은 결과를 항상 숫자 데이터 타입, 즉 십진수로 반환한다.
-- & 비트 연산은 2진수끼리의 연산에서 값이 모두 1일경우 해당 자리를 1로 반환한다. (2의 제곱수는 어짜피 해당 자리만 1이니까 비교되는 수가 그 자리가 1인지 판단가능)
-- GENOTYPE & 2 != 2 는
-- → "2번 형질이 단독으로 있지 않다" 가 아니라
-- → "2번 형질이 없거나, 여러 형질 중에 있을 수도 있는 상태" 로 해석될 수 있어요.

-- 하지만 정확하게 2번 형질이 없는 경우 를 표현하려면: → GENOTYPE & 2 = 0