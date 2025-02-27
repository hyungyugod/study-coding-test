import math as m

def solution(a, b):
    answer = 1 
    if ((a//m.gcd(a,b)) / (b//m.gcd(a,b))) % 1 == 0:
        answer = 1
    else:
        for i in range(2, b//m.gcd(a,b) + 1 ):
            if (b//m.gcd(a,b)) % i == 0 and i % 2 != 0 and i % 5 != 0:
                answer = 2
                break
    return answer
