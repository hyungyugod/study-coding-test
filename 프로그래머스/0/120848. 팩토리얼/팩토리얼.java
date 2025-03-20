class Solution {
    public int solution(int n) {
        for ( int i = 1; i < (int) Math.sqrt(n)+3; i++){
            if (fac(i) > n) return i-1;
        }
        return 0;
    }

    public int fac(int n){
        int answer = 1;
        for (int i = 1; i < n + 1; i++){
            answer *= i;
        }
        return answer;
    }
}