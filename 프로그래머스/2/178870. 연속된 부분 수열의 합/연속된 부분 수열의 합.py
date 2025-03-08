def solution(sequence, k):
    left, right = 0, 0
    current_sum = sequence[0]
    min_length = float('inf')
    result = [-1, -1]

    while right < len(sequence):
        if current_sum == k:  # 조건을 만족하면 갱신
            if (right - left) < min_length:
                min_length = right - left
                result = [left, right]
                
        if current_sum >= k:  # 합이 크거나 같다면 left 이동
            current_sum -= sequence[left]
            left += 1
        else:  # 합이 작다면 right 이동
            right += 1
            if right < len(sequence):
                current_sum += sequence[right]

    return result
