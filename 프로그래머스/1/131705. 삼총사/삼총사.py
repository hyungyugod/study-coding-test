def solution(number):
    answer = 0
    for i in range(len(number)):                           # 한칸씩 앞으로 가면서 고르면 절대로 겹칠 일은 없음
        for a in range(i+1, len(number)):
            for b in range(a+1, len(number)):
                if number[i] + number[a] + number[b] == 0:
                    answer += 1
    return answer