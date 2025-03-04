def solution(n):
    answer = []
    z = 0
    t = n
    while t // 3 != 0:
        a,b = divmod(t,3)
        t = a
        answer.append(b)
        
    answer.append(t)
    
    for i in range(len(answer)):
        z += (3 ** (len(answer) - i - 1)) * answer[i]
    return z