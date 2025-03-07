def solution(elements):
    n = len(elements)
    e2 = elements * 2  # 원형 배열을 처리하기 위해 두 배로 확장

    box = set()

    for length in range(1, n + 1):  # 부분 수열의 길이 (1부터 n까지)
        for start in range(n):  # 원래 배열 크기만큼만 시작점 고려
            box.add(sum(e2[start:start + length]))  # 부분합 추가

    return len(box)  # 서로 다른 부분합의 개수 반환
