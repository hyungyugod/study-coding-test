class Solution {
    public int solution(int[][] board, int k) {
    int answer = 0;
    for (int y = 0; y < board.length; y++){
        for (int x = 0; x < board[y].length; x++){
            if (y + x <= k){
                answer += board[y][x];
            }
        }
    }
    return answer;
}
}