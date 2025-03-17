from collections import Counter
def solution(X, Y):
    # 각 요소가 몇번씩 나오는지를 딕셔너리로 리턴해준다. 심지어 중복까지 제거해준다.
    X_c = Counter(X)
    Y_c = Counter(Y)

    answer = []

    for i in X_c:
        if i in Y_c:
            answer.extend([i] * min(X_c[i], Y_c[i])) # i라는 값을 더 적게 들어있는 만큼 리스트에 추가한다.
    
    if not answer: # answer리스트가 비어있으면
        return "-1"
    
    elif answer.count("0") > 1 and len(answer) == answer.count("0"):
        return "0"
    
    else:
        pass

    return "".join(sorted(answer,reverse = True))