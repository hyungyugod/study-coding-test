def solution(a, b, n):
    answer = 0
    while n >= a:
        x = n // a        
        answer += x * b     
        n = x * b + n % a    
    return answer