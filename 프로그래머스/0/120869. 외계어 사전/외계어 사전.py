def solution(spell, dic):
    answer = 2
    for i in dic:
        if sorted(i) == sorted(spell):              # 어짜피 sorted가 리스트를 반환하므로 이렇게 비교해도됨
            answer = 1
            break
    return answer