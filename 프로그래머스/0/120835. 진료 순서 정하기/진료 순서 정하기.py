def solution(emergency):
    answer = []
    s_emergency = sorted(emergency)[::-1]
    for i in emergency:
        answer.append((s_emergency.index(i)) + 1)
        
    return answer