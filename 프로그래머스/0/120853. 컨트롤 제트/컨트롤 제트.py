def solution(s):
    answer = 0
    box = []
    s_split = s.split(" ")
    for i in s_split:
        if i != "Z":
            answer += int(i)
            box.append(int(i))

        else:
            answer -= box[-1]

    
    return answer