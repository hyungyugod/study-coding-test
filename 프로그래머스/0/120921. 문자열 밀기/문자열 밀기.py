def solution(A, B):
    if A in (B * 2):
        return (B * 2).index(A)
    return -1