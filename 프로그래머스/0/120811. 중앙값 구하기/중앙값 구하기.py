def solution(array):
    sort_array = sorted(array)
    x = len(sort_array)
    return sort_array[(x + 1) // 2 - 1]