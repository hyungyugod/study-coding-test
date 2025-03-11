def solution(dartResult):
    num = [0]
    num_yet = ""
    for i in dartResult:
        if i.isnumeric():
            num_yet += i
        else:
            if len(num_yet) > 0:
                num.append(int(num_yet))
                num_yet = ""
            
            if i == "D":
                num[-1] = num[-1] ** 2
                
            elif i == "S":
                pass
            
            elif i == "T":
                num[-1] = num[-1] ** 3
                
            elif i == "#":
                num[-1] = num[-1] * (-1)
                
            else: # i == "*"
                num[-1] = num[-1] * 2
                num[-2] = num[-2] * 2
                    
    return sum(num)