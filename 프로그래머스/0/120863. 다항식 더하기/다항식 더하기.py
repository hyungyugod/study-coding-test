def solution(polynomial):
    a = 0
    b = 0
    polynomial_x = polynomial.split(" + ")
    for i in polynomial_x:
        if i.isnumeric():
            b += int(i)
        else:
            i_x = i.replace("x","")
            if i_x == "":
                a += 1
            else:
                a += int(i_x)
    if a == 0:
        answer = str(b)
    elif b == 0:
        answer = f"{a}x"
        if a == 1:
            answer = "x"
    else:
        answer = f"{a}x + {b}"
        if a == 1:
            answer = f"x + {b}"
        
    return answer
    