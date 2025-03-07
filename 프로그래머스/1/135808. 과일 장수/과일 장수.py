def solution(k, m, score):
    answer = 0
    s = sorted(score,reverse = True)
    for i in range(m-1,len(s),m):
        answer += (s[i] * m)
    return answer