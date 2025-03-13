def solution(s, skip, indx):
    answer = []
    alp = "abcdefghijklmnopqrstuvwxyz"
    for i in skip:
        alp = alp.replace(i,"")
    
    for j in s:
        answer.append(alp[(alp.index(j) + indx) % len(alp)])

    return "".join(answer)