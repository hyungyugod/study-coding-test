class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int n3 = numer1 * denom2 + denom1 * numer2;
        int d3 = denom1 * denom2;
        int g = gcd(n3, d3);

        answer[0] = n3/g;
        answer[1] = d3/g;
        
        return answer;

    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}