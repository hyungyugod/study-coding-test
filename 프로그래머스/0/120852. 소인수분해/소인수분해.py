def solution(n):
    answer = []
    box = []
    for i in range(2, n+1):
        if n % i == 0:                     # 약수인가?
            for j in range(2, i):
                if i % j == 0:             # 소수인가?
                    box.append(j)
            if len(box) == 0:
                answer.append(i)
        box = []                           # 박스가 바깥 for과 같아지면
    return answer
