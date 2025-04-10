-- 쓰는 테이블 ID, SIZE_OF_COLONY -> 최댓값
SELECT E.ID, CASE
                WHEN R.RN <= C.CT * 0.25 THEN 'CRITICAL'
                WHEN R.RN <= C.CT * 0.50 THEN 'HIGH'
                WHEN R.RN <= C.CT * 0.75 THEN 'MEDIUM'
                ELSE 'LOW'
             END AS COLONY_NAME
    FROM ECOLI_DATA E
    JOIN (SELECT ID, ROW_NUMBER() OVER (ORDER BY SIZE_OF_COLONY DESC) AS RN
            FROM ECOLI_DATA) R ON E.ID = R.ID
    JOIN (SELECT COUNT(*) AS CT
            FROM ECOLI_DATA ) AS C
    ORDER BY E.ID ASC;