def solution(numbers, direction):
    answer = []
    if direction == "right":
        answer.append(numbers[-1])
        numbers.pop()
        for i in numbers:
            answer.append(i)
    else:
        a = numbers[0]
        numbers.remove(numbers[0])
        for i in numbers:
            answer.append(i)
        answer.append(a)
    return answer