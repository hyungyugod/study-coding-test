def solution(keymap, targets):
    keyj = "".join(keymap)
    s_keyj = set(keyj)
    dic = {}
    box = 1000
    answer = [0] * len(targets)

    for i in s_keyj:
        for j in keymap:
            if i in j:
                box = min(box, j.find(i) + 1)
        dic.update({i: box})
        box = 1000
# 여기까지 나의 아이디어와 동일
    for x, y in enumerate(targets):
        total = 0             # 새로운 타겟을 꺼낼때 자동 초기화, 이렇게 하면 굳이 마지막에 0으로 초기화하지 않아도 돼서 깔끔하다.
        for k in y:
            if k not in dic:  # 만약 k가 dic에 없다면, keymap에 없는 문자이므로
                total = -1
                break
            total += dic[k]
        answer[x] = total

    return answer
