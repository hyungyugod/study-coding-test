def solution(babbling):
    answer = 0
    for i in babbling:
        for z in ["aya", "ye", "woo", "ma"]:
            if z in i:
                i = i.replace(z,"-")          # "aya", "ye", "woo", "ma" 가 포함된 글자를 -로 치환
        i = "".join(i.split("-"))             # 최종 검열전에 상관 없었던 -를 삭제
        if len(i) == 0:
            answer += 1
    return answer