def solution(n):
    answer = []
    if n % 2 == 0:                # 짝수일때
        for i in range(1, n//2 + 1):
            answer.append(i * 2 -1)
    
    if n % 2 != 0:                # 홀수일때
        for i in range(1, (n + 1) // 2 +1):
            answer.append(i * 2 - 1)
    
    return answer