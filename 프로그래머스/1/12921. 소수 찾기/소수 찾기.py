def solution(n):
    if n < 2:
        return 0  # 2보다 작은 경우 소수가 없음

    cnt = 0
    for i in range(2, n+1):  # 2부터 n까지 확인
        is_prime = True
        for z in range(2, int(i ** 0.5) + 1):  # 2부터 √i까지만 검사
            if i % z == 0:
                is_prime = False
                break  # 약수가 발견되면 더 이상 검사할 필요 없음
        if is_prime:
            cnt += 1  # 소수 개수 증가

    return cnt
