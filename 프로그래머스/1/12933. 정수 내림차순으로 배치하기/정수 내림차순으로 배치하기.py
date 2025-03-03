def solution(n):
    r_n = int("".join(reversed(sorted(str(n)))))  # 문자열을 뒤집은 후, int 변환
    return r_n