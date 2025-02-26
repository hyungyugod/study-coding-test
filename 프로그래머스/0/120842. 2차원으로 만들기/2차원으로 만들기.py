def solution(num_list, n):
    answer = []
    box = []
    for i in num_list:
        box.append(i)
        if len(box) == n:
            answer.append(box)
            box = []

    return answer