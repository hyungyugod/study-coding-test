def solution(arr1, arr2):
    if len(arr1) == len(arr2):
        if sum(arr1) == sum(arr2):
            answer = 0
        else:
            answer = int(2 * (sum(arr1) > sum(arr2)) - 1)
    else:
        answer = int(2 * (len(arr1) > len(arr2)) - 1)     
    return answer