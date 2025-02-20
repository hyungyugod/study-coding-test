def pectorial(n):
    box = 1
    for i in range(1, n+1):
        box *= i

    return box

def solution(balls, share):
    return pectorial(balls) // (pectorial(balls - share) * pectorial(share))