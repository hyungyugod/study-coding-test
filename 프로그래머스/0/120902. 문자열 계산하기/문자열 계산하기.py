def solution(my_string):
    answer = int(my_string.split(" ")[0])
    box = ["0"]
    for i in my_string.split(" ")[1:]:
        box.append(i)
        if i.isdigit() and box[-2] == "-":
            answer -= int(i)
            box = ["0"]
        elif i.isdigit() and box[-2] == "+":
            answer += int(i)
            box = ["0"]
    return answer