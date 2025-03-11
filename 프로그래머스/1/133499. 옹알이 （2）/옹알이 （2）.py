def solution(babbling):
    l = ["aya", "ye", "woo", "ma"]
    answer = 0
    for i in babbling:
        for j in l:
            if j in i and j*2 not in i:
                i = i.replace(j,"-")
        i = i.replace("-","")
        if len(i) == 0:
            answer += 1
    return answer