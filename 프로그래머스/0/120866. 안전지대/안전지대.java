class Solution {
    public int solution(int[][] board) {
    int n = board.length;
    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    int answer = 0;

    // 위험지역 표시
    for (int y = 0; y < n; y++) {
        for (int x = 0; x < n; x++) {
            if (board[y][x] == 1) {
                for (int i = 0; i < 8; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];
                    if (ny >= 0 && ny < n && nx >= 0 && nx < n && board[ny][nx] == 0) {
                        board[ny][nx] = 2; // 위험지역 표시
                    }
                }
            }
        }
    }

    // 안전한 지역 세기
    for (int y = 0; y < n; y++) {
        for (int x = 0; x < n; x++) {
            if (board[y][x] == 0) {
                answer++;
            }
        }
    }

    return answer;
}

}