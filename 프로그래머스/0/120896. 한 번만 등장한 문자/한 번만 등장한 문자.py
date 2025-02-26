def solution(s):
    answer = []
    box = []                    
    for i in s:
        if i in answer:
            answer.remove(i)
            box.append(i)

        elif i not in answer and i in box:
            box.append(i)

        else:
            answer.append(i)
            box.append(i)

    return "".join(sorted(answer))