def solution(s):
    box = []
    answer = []
    for i in s:
        if i in box:
            answer.append(len(box)-box.index(i))  # 전 인덱스와의 차이 + 1 == 전에 나왔던 것과 떨어진 길이
            box[box.index(i)] = "0"
            box.append(i)
        else:
            box.append(i)
            answer.append(-1)
    return answer