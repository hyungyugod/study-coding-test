def solution(participant, completion):
    pt = sorted(participant)
    cl = sorted(completion) + ["0"]
    for i in range(len(participant)):
        if pt[i] != cl[i]:
            answer = pt[i]
            return answer
    return 0 