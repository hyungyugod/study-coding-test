def solution(people, limit):
    people.sort()                        # 사람들의 체중을 오름차순 정렬
    left, right = 0, len(people) - 1
    answer = 0
                  
    while left <= right:                 # 왼쪽 포인터와 오른쪽 포인터가 교차할 때까지 반복
                                         # 가장 가벼운 사람과 가장 무거운 사람의 합이 limit 이하이면 두 사람을 함께 태울 수 있음
        if people[left] + people[right] <= limit:
            left += 1
                                         # 무거운 사람은 항상 보트에 태워야 함
        right -= 1
        answer += 1                      # 한 보트를 사용했으므로 작업 횟수 증가
    
    return answer
