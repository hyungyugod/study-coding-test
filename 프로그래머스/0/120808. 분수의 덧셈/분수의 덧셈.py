def min_min(a, b):      
    s = []
    t = []

    for i in range(1, a+1):
        if a % i == 0:     
            s.append(i)

    for x in s:
        if b % x == 0:
            t.append(x)
    return t[-1]

def solution(numer1, denom1, numer2, denom2):    
    d = denom1 * denom2 // min_min(denom1,denom2)
    f = (d // denom1) * numer1 + (d // denom2) * numer2                          
    return [f / min_min(d,f),d / min_min(d,f)]