def solution(cards1, cards2, goal):
    c1 = cards1 + [0]
    c2 = cards2 + [0] 
    for i in goal:
        if i == c1[0]:
            c1.pop(0)
            
        elif i == c2[0]:
            c2.pop(0)
            
        else:
            return "No"
        
    return "Yes"