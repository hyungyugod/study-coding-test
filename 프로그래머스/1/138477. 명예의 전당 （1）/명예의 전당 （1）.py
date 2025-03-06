def solution(k, score):
    answer = []
    box = []
    for i in score:
        box.append(i)
        box.sort()
        if len(box) == k + 1:
            box.pop(0)           # pop 안에는 인덱스를 넣어야 한다.
            answer.append(box[0])        
        
        else:
            answer.append(box[0])
            
    return answer