class Solution {
    public long[] solution(int x, int n) {
    long[] answer = new long[n];
    int cnt = 0;
    long present = 0;
    while (cnt < n){
        present = present + x;
        answer[cnt] = present;
        cnt++;
    }
    return answer;
}
}