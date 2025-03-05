def solution(sizes):
    m = []
    s = []
    for i in sizes:
        m.append(max(i[0],i[1]))
        s.append(min(i[0],i[1]))
    return max(m) * max(s)