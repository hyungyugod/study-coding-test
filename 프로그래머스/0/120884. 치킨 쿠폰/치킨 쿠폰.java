class Solution {
    public static int solution(int chicken) {
        int div = chicken;
        int answer = 0;

        while (div >= 10){
        int mod = div % 10;
        div = div/10;
        answer += div;
        div = div + mod;

        }
        return answer;
    }
}