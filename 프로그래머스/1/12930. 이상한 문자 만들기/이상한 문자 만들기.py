def solution(s):
    answer = []
    cnt = 0
    for i in s:
        if i == " ":
            answer.append(i)
            cnt = 0
            
        elif cnt == 0:
            i = i.upper()
            answer.append(i)
            cnt += 1
            
        elif cnt % 2 == 0:
            i = i.upper()
            answer.append(i)
            cnt += 1
            
        else:
            i = i.lower()
            answer.append(i)
            cnt += 1
            
    return "".join(answer)