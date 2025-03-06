def solution(name, yearning, photo):
    answer = []
    box = []
    dic = {}
    dic.update(list(zip(name,yearning)))
    for i in photo:
        for j in i:
            if j in dic:
                box.append(dic[j])
        answer.append(sum(box))
        box = []
    return answer