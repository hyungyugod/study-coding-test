def solution(numbers):
    a = sorted(numbers)
    return max(a[-1] * a[-2], a[0] * a[1]) 