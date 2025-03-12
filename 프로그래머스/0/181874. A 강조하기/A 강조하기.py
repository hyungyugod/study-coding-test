def solution(myString):
    A_string = myString.replace("a","A")
    answer = ""
    for i in A_string:
        if i.isupper and i != "A":
            answer += i.lower()
        else:
            answer += i
    return answer