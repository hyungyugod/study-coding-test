def solution(n):
    answer = [1, 2]
    for i in range(4, 3 * n):
        if i % 3 ==0 or "3" in str(i):
            pass
        else:
            answer.append(i)
    return answer[n-1]