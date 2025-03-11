def solution(s):
    answer = 0
    box = [0,0]
    x = [0]
    for i in s:
        if x[0] == 0:
            x[0] = i
        
        if x[0] == i:
            box[0] += 1

        elif x[0] != i and x[0] != 0:
            box[1] += 1

        if box[0] == box[1] and box[0] != 0:
            answer += 1
            box = [0,0]
            x = [0]
            
    if x[0] != 0:
        answer += 1

    return answer