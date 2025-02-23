def solution(sides):
    a = max(sides)
    sides.remove(a)
    return -(a < sum(sides)) + 2