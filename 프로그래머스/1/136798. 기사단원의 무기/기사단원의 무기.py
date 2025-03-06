import math

def solution(number, limit, power):
    answer = 0
    for i in range(1, number + 1):
        cnt = 0
        sqrt_i = int(math.sqrt(i))
        for z in range(1, sqrt_i + 1):
            if i % z == 0:
                # z와 i//z가 같은 경우는 중복되지 않게 한 번만 센다.
                if z == i // z:
                    cnt += 1
                else:
                    cnt += 2
            # 만약 이미 약수의 개수가 limit를 초과하면, power 값을 할당하고 반복 종료
            if cnt > limit:
                cnt = power
                break
        answer += cnt
    return answer