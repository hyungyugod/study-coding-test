def solution(seoul):
    for i in seoul:
        if i == "Kim":
            answer = f"김서방은 {seoul.index(i)}에 있다"
    return answer