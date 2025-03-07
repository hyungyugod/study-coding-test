def solution(n, m, section):
    answer = 1
    p = section[0] + (m - 1)       # 현재 룰러가 커버하고 있는 범위
    if m == n:
        return 1
    else:
        for i in section:
            if i <= p:             # 커버하고 있는 범위이면 패스
                pass
            else:
                p = i + (m - 1)    # 커버 범위가 넘치면 룰러 커버 범위를 바꿈
                answer += 1        # 룰러 개수를 추가
    
    return answer                  