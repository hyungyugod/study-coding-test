def solution(numbers):
    a = []
    a.append(max(numbers))
    numbers.remove(max(numbers))
    a.append(max(numbers))
    return a[0] * a[1]   