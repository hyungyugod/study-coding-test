def solution(food):
    answer = ''
    for i in food:
        if food.index(i) == 0:
            continue
            
        if i % 2 != 0:
            x = i - 1
            if x == 0:
                continue
                
        else:
            x = i
        
        answer += str(food.index(i)) * (x // 2)
        
        food[food.index(i)] = -1
        
    return answer + "0" + answer[::-1]