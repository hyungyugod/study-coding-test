def solution(dots):
    # 기울기 계산 함수
    def get_slope(a, b):
        return (dots[b][1] - dots[a][1]) / (dots[b][0] - dots[a][0])

    # 가능한 두 개의 직선 조합을 비교
    if get_slope(0,1) == get_slope(2,3): return 1
    if get_slope(0,2) == get_slope(1,3): return 1
    if get_slope(0,3) == get_slope(1,2): return 1
    
    return 0  # 평행한 두 직선이 없으면 0 반환

