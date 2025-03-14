def solution(board, h, w):
    n = len(board)
    count = 0
    dh = [0, 1, -1, 0]      # 양옆, 위 아래를 모두 탐색하기 위해 변화량을 이용해서 탐색을 했다.
    dw = [1, 0, 0, -1]      # 하여 모든 곳을 탐색할 수 있도록 dw와 dh값을 배치했다.
    for i in range(4):
        h_check = h + dh[i]
        w_check = w + dw[i]
        if 0 <= h_check < n and 0 <= w_check < n:     # 범위안에 드는 곳만 검사한다.
            if board[h][w] == board[h_check][w_check]: # 이동한 곳과 같은 곳을 가르키면 1을 반환한다.
                count += 1
    return count