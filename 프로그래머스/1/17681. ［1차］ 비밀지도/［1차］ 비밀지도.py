def Bi(n, p):                      # 이진수 생성
    answer = []
    for i in n:
        box = []
        while i > 0:
            a = i // 2
            box.append(str(i % 2))
            i = a
        if len(box) < p:
            box.append("0" * (p-len(box)))      # 주어진 p자리수로 자릿수 맞추기
        answer.append("".join(box[::-1])) 
              
    return answer


def solution(n, arr1, arr2):
    answer = []
    x = Bi(arr1,n)                  # arr1을 이진수를 나타내는 문자열로 바꾼 것
    y = Bi(arr2,n)
    for i in range(n):
        box = []
        for z in range(n):
            if x[i][z] == "0" and y[i][z] == "0":
                box.append(" ") 
            else:
                box.append("#")
        answer.append("".join(box))
        box = []           
    
    return answer