def solution(s, n):
    answer = []
    alp = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"] * 2
    for i in s:
        if i.isupper():
            ri = i.lower()
            ui = (alp[alp.index(ri)+n]).upper()
            answer.append(ui)
            
        elif i == " ":
            answer.append(i)
            
        else:
            answer.append(alp[alp.index(i)+n])
            
    return "".join(answer)