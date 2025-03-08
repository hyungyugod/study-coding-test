def solution(want, number, discount):
    answer = 0
    for i in range(len(discount)-10+1):
        for a,b in (zip(want,number)):
            is_answer = True
            if discount[i:i+10].count(a) == b:
                pass
            else:
                is_answer = False
                break
        if is_answer:
            answer += 1

    return answer