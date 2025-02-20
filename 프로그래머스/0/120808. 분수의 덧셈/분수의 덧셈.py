def solution(numer1, denom1, numer2, denom2):
    s = []
    t = []
    j = []
    k = []

    for i in range(1, denom1+1):
        if denom1 % i == 0:     
            s.append(i)

    for x in s:
        if denom2 % x == 0:
            t.append(x)

    d = denom1 * denom2 // t[-1]                        
    f = (d // denom1) * numer1 + (d // denom2) * numer2     
    
    for i in range(1,d+1):
        if d % i == 0:     
            j.append(i)

    for x in j:
        if f % x == 0:
            k.append(x)

    return [f / k[-1],d / k[-1]]