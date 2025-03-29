class Solution {
    public int[][] solution(int n) {
    int[][] answer = new int[n][n];
    int[] dx = {1, 0, -1, 0}; // 2차원 배열 탐색할테는 방향키부터 설정해두고가기 -> 무조건 인덱스 기준으로로
    int[] dy = {0, 1, 0, -1};

    int x = 0; int y = 0; int k = 0; // 는 방향키 모드를 바꾼다.
    
    for (int i = 1; i < n * n + 1; i++){
        answer[y][x] = i; // 중요한 걸 앞에에

        int nx = x + dx[k % 4]; 
        int ny = y + dy[k % 4];

        if (nx < 0 || nx > n-1 || ny < 0 || ny > n-1 || answer[ny][nx] != 0){
            k++; // 벽에 부딫이거나 이미 값이 있으면 방향전환

            nx = x + dx[k % 4]; // 다음을 재정의
            ny = y + dy[k % 4];
        }

        x = nx;   // 드디어 다음 값을 진짜 다음값으로 인정정
        y = ny;
        
    }

    return answer;

}

}