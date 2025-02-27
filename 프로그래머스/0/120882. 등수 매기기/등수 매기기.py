def solution(score):
    answer = []
    n_score = []
    for i in score:                          # 평균 모으기
        n_score.append(sum(i)/len(i))       # sum(i)//len(i)라고 했을때 정수부분만 나와서 평균값을 엄밀히 나눌 수 없다.
    
    for i in n_score:                        # 원소는 원래 정렬에서 꺼내고 인덱스는 정렬된 곳에서 꺼내기
        answer.append(sorted(n_score)[::-1].index(i) + 1)
    return answer