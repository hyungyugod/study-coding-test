def solution(keyinput, board):
    f = [0,0]
    for i in keyinput:
        if i == "right" and f[0]<(board[0]-1)//2:
            f[0] += 1
        elif i == "left" and f[0]>-((board[0]-1)//2):
            f[0] -= 1
        elif i == "up" and f[1]<(board[1]-1)//2:
            f[1] += 1
        elif i == "down" and f[1]>-((board[1]-1)//2):
            f[1] -= 1
    return f