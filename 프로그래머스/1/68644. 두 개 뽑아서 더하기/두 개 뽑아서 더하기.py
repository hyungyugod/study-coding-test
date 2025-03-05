from itertools import combinations
def solution(numbers):
    answer = []
    c = combinations(numbers,2)
    for a,b in c:
        answer.append(a + b)
        
    return sorted(set(answer))