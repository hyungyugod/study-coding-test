def solution(absolutes, signs):
    answer = []
    for i in range(len(absolutes)):
        answer.append((2 * signs[i] - 1) * absolutes[i])
    return sum(answer)