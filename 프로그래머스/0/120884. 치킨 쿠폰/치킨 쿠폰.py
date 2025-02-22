def solution(chicken):
    answer = chicken // 10
    c = chicken // 10 + chicken % 10
    while c >= 10:                    # 참일 동안만 반복한다.
        a = c // 10
        b = c % 10
        answer += a
        c = a + b
    return answer