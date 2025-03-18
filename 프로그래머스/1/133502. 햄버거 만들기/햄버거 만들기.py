def solution(ingredient):
    stack = []
    answer = 0
    
    for i in ingredient:
        stack.append(i)
        # 최근 4개의 원소가 "1231"이면 햄버거 포장
        if stack[-4:] == [1, 2, 3, 1]:
            answer += 1
            # 햄버거 패턴 제거
            del stack[-4:]

    return answer
