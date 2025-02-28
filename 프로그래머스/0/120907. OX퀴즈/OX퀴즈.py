def solution(quiz):
    answer = []
    for r in quiz:
        i = r.split(" ")
        i.remove("=")
        if "-" in i:
            i.remove("-") 
            if int(i[0]) - int(i[1]) == int(i[2]):
                answer.append("O")
            else:
                answer.append("X")
        else:
            i.remove("+") 
            if int(i[0]) + int(i[1]) == int(i[2]):
                answer.append("O")
            else:
                answer.append("X")
    return answer
