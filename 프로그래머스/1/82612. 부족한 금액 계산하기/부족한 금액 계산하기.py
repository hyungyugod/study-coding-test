def solution(price, money, count):
    a = ((1+count)/2 * count) * price - money
    if a > 0:
        return a
    else:
        return 0
