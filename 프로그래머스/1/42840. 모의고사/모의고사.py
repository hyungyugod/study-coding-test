def solution(answers):
    answer = []
    a, b, c = 0, 0, 0
    for i,j in enumerate(answers):
        if [1,2,3,4,5][i % 5] == j:
            a += 1
            
    for i,j in enumerate(answers):
        if [2,1,2,3,2,4,2,5][i % 8] == j:
            b += 1
            
    for i,j in enumerate(answers):
        if [3,3,1,1,2,2,4,4,5,5][i % 10] == j:
            c += 1
            
    if max(a,b,c) == a:
        answer.append(1)
    
    if max(a,b,c) == b:
        answer.append(2)
    
    if max(a,b,c) == c:
        answer.append(3)
        
    return sorted(answer)