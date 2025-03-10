def solution(queue1, queue2):
    total = sum(queue1) + sum(queue2)
    # 전체 합이 홀수이면 두 큐의 합을 같게 만들 수 없음
    if total % 2:
        return -1
    target = total // 2
    n = len(queue1)
    
    # 두 큐를 하나의 배열로 결합하고, 이를 순환 구조로 사용합니다.
    arr = queue1 + queue2
    # 초기 상태: queue1은 arr[0]부터 arr[n-1]까지 (현재 합은 sum(queue1))
    start = 0
    end = n - 1
    current_sum = sum(queue1)
    count = 0
    max_ops = 4 * n  # 무한 루프를 방지하기 위한 최대 연산 횟수 제한
    
    # 투 포인터 기법으로 현재 구간(실제 큐1에 해당)의 합을 target과 맞춥니다.
    while count <= max_ops:
        if current_sum == target:
            return count
        elif current_sum < target:
            end += 1
            # 배열이 순환 구조이므로, end의 위치는 모듈러 연산으로 보정합니다.
            current_sum += arr[end % (2 * n)]
            count += 1
        else:
            # start 포인터도 순환 배열 내에서의 위치로 보정하여 접근합니다.
            current_sum -= arr[start % (2 * n)]
            start += 1
            count += 1
            
    return -1