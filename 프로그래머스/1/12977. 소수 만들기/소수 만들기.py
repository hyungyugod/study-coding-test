from itertools import combinations

def solution(nums):
    c_nums= combinations(nums, 3)
    answer = 0
    for i in c_nums:
        for j in range(2, sum(i)):
            is_t = True
            if sum(i) % j == 0:
                is_t = False
                break
        if is_t:
            answer += 1
    return answer