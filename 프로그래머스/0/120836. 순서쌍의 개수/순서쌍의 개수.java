class Solution {
    public int solution(int n) {
        int cnt = 0;
        for (int i = 1; i < (int) Math.sqrt(n) + 1; i++){
            if (n % i == 0){
                cnt += 1;
            }
        }
        return Math.sqrt(n) % 1 == 0 ? (cnt-1) * 2 + 1: cnt * 2;
    }
}