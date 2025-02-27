def solution(dots):
    answer = 0
    w = []
    h = []
    for i in dots:
        w.append(i[0])
        h.append(i[1])
    return abs(list(set(w))[0] - list(set(w))[1]) * abs(list(set(h))[0]-list(set(h))[1])