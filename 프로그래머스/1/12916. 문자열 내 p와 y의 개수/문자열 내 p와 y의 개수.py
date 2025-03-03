def solution(s):
    cp = 0
    cy = 0
    for i in s:
        if i == "p" or i == "P":
            cp += 1
        elif i == "y" or i == "Y":
            cy += 1 
    return cp == cy