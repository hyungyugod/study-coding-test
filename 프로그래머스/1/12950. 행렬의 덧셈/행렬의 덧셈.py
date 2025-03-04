def solution(arr1, arr2):
    answer = []
    for y in range(0,len(arr1)):
        box = []
        for x in range(0,len(arr1[y])):
            box.append(arr1[y][x] + arr2[y][x])
        answer.append(box)
        box = []
    return answer