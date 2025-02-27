def solution(sides):
    answer = 0
    for i in range(sum(sides)):
        v = sides + [i]
        if 2 * max(v) < sum(v):
            answer += 1
    return answer