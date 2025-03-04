def solution(arr):
    box = []
    answer = []
    for i in arr:
        if i in box or len(box) == 0:
            box.append(i)
        else:
            a = box.pop()
            answer.append(a)
            box = []
            box.append(i)
    a = box.pop()
    answer.append(a)
    return answer