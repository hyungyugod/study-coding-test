def solution(array):
    new_array = list(set(array))   
    x = []

    for i in new_array:
        x.append(array.count(i))
    
    a = max(x)                     
    b = a
    c = x.index(max(x))            
    x.remove(a)                    

    if b in x:
        answer = -1
    
    else:
        answer = new_array[c]

    return answer