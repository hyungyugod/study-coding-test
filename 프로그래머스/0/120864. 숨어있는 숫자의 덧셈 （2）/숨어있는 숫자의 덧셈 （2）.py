def solution(my_string):
    answer = []
    box = "0"
    for i in (my_string + "a"):
        if i.isdigit():
            box += i
        else:
            answer.append(int(box))
            box = "0"

    return sum(answer)
