def solution(n, lost, reserve):
    # 도난당한 학생과 여벌이 있는 학생이 겹치는 경우 제거
    for i in reserve[:]:
        if i in lost:
            lost.remove(i)
            reserve.remove(i)
    
    # 남은 reserve 학생이 주변 학생에게 체육복을 빌려줌
    for i in sorted(reserve):
        if (i - 1) in lost:
            lost.remove(i - 1)
        elif (i + 1) in lost:
            lost.remove(i + 1)
    
    return n - len(lost)
