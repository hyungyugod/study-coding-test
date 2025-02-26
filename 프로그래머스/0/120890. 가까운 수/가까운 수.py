def solution(array, n):
    answer = 100
    box = []
    for i in array:
        if abs(n - i) < answer:
            box = []
            answer = abs(n - i)
            box.append(i)
        elif abs(n - i) == answer:
            box.append(i)       
    return min(box)
