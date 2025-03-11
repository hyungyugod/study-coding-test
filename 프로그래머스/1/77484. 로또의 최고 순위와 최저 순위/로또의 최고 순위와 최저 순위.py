def solution(lottos, win_nums):
    same = len(set(lottos) & set(win_nums))
    zero = lottos.count(0)
    s_max = max(1,same + zero)   # 최대 겹침
    s_min = max(1,same)          # 최소 겹침
    
    return [7 - s_max, 7 - s_min]