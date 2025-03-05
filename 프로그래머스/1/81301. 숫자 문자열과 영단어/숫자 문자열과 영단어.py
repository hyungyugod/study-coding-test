def solution(s):
    answer = []
    box=""
    dic = {"zero":"0", "one":"1", "two":"2", "three":"3", "four":"4", "five":"5", "six":"6", "seven":"7", "eight":"8", "nine":"9"}
    for i in s:
        if i.isnumeric():
            answer.append(i)

        else:
            box += i
            if box in dic:
                answer.append(dic[box])
                box = ""
    return int("".join(answer)) 
