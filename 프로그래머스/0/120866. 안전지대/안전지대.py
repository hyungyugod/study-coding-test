def solution(board):
    update = []
    for y, f in enumerate(board):
        for x, value in enumerate(f):
            if value == 1:
                for a,b in [(x,y),(x-1,y-1),(x-1,y),(x-1,y+1),(x,y+1),(x,y-1),(x+1,y-1),(x+1,y),(x+1,y+1)]:
                    if 0 <= a <= len(board)-1 and 0 <= b <= len(board)-1 :
                        update.append((a,b))
    return len(board) * len(board) - len(list(set(update)))
