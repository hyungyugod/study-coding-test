from collections import Counter
def solution(strArr):
    answer = []
    for i in strArr:
        answer.append(len(i))
    
    return max(Counter(answer).values())