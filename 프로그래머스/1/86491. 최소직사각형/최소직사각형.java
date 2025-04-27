class Solution {
    public int solution(int[][] sizes) {
    int answer = 0;
    int m = 0; // 둘 중 큰 것 중에 제일 큰거
    int n = 0; // 둘 중 작은 것 중에 제일 큰거
    for (int[] i : sizes){
        int pm = Math.max(i[0], i[1]);
        int pn = Math.min(i[0], i[1]);
        if (pm > m){
            m = pm; // 지금까지 pm 보다 더 크면 갱신한다.
        }

        if (pn > n){
            n= pn; // 지금까지 pn보다 더 크면 갱신한다.
        }
    }
    return m * n;
}
}