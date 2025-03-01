def solution(lines):
    a = 0
    answer = set()  # 중복 방지를 위해 set 사용
    box = []  # 지나간 구간을 저장하는 리스트

    for i in lines:
        for z in range(i[0], i[1]):  # 선분의 끝값(i[1]) 포함 X
            if z in box:
                answer.add(z)  # 두 개 이상의 선분이 겹치는 구간을 저장
            box.append(z)  # 지나간 구간 저장

    if len(answer) > 0:  # 겹치는 구간이 있다면
        a += len(answer)  # 겹치는 길이 계산

    return a