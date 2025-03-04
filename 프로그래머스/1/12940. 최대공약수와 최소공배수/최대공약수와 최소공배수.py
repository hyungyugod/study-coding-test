import math

def solution(n, m):
    for i in range(1, max(n,m)+1):
        if min(n,m) * i % max(n,m) == 0:
            lcm = min(n,m) * i
            break
    return [math.gcd(n,m),lcm]