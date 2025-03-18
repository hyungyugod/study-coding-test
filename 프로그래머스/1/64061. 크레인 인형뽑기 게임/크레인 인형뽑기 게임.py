def solution(board, moves):
    # board를 세로 방향으로 변환 (zip을 사용하여 행렬 전환)
    sb = list(map(list, zip(*board)))  # 전치 행렬
    stack = [0]  # 바구니 (초기값 0 설정)
    answer = 0  # 터트린 인형 개수
    
    for i in moves:
        for j in range(len(sb[i-1])):  # 해당 열에서 인형 찾기
            if sb[i-1][j] != 0:  # 0이 아닌 첫 번째 값 찾기
                if stack[-1] == sb[i-1][j]:  # 바구니의 마지막 값과 같은 경우
                    stack.pop()  # 같은 값이면 제거
                    answer += 2  # 인형 두 개 터짐
                else:        
                    stack.append(sb[i-1][j])  # 바구니에 추가

                sb[i-1][j] = 0  # 뽑은 인형 자리를 0으로 변경
                break  # 하나만 뽑으면 반복 종료

    return answer