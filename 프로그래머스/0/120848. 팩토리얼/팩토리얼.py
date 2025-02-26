def fec(n):
    answer = 1
    for i in range(1, n+1):
        answer *= i
    return answer

def solution(n):
    for i in range(1, 12):
        if fec(i) > n:
            return i - 1