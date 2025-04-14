SELECT COUNT(*) as USERS 
    from USER_INFO 
    where TO_CHAR(JOINED, 'YYYY') = '2021' AND (AGE between 20 and 29);