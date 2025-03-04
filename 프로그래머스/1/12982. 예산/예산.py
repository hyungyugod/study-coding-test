def solution(d, budget):
    box = []
    for i in sorted(d):
        if sum(box) + i <= budget:
            box.append(i)
            
        else:
            break
    return len(box)