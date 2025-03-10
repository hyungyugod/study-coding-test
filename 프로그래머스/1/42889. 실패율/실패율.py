def cnt(listin, n):       # stage에서 n의 개수를 카운트하기 위한 함수를 미리 설정
    return listin.count(n)

def solution(N, stages):
    l = len(stages)
    dic = {}
    remaining = l  # 현재 스테이지에 도달한 플레이어 수 (처음엔 모두 도달) - 위에서는 바로 전것만빼서 지난 스테이지에 남은 사람들을 모두 고려하지 못했음.

    for n in range(1, N + 1):
        count_n = cnt(stages, n)
        if remaining == 0:
            failure_rate = 0
        else:
            failure_rate = count_n / remaining
        dic.update({n: failure_rate})  # 실패율을 계산하여 딕셔너리에 추가 (키: stage 번호, 밸류: 실패율)
        remaining -= count_n  # 다음 스테이지에 도달한 플레이어 수 갱신

    dic_i = dic.items()  # 딕셔너리의 (키, 밸류) 튜플들을 담은 뷰 객체
    dic_s = sorted(dic_i, key=lambda x: x[1], reverse=True)  # 밸류값(실패율)을 기준으로 내림차순 정렬
    dic_s_k = [item[0] for item in dic_s]  # 정렬된 튜플 리스트에서 키값만 추출하여 리스트로 반환
    return dic_s_k
