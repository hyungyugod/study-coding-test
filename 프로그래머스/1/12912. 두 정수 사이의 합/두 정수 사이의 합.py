def solution(a, b):
    answer = 0
    if a != b:
        for i in range(min(a,b),max(a,b) +1):
            answer += i
    else:
        answer = a
    return answer