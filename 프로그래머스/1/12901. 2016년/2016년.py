def solution(a, b):
    week = ["SUN","MON","TUE","WED","THU","FRI","SAT"]
    return week[((b-1) + sum([3,1,3,2,3,2,3,3,2,3,2,3][:a-1]) + 5) % 7]