class Solution {
    public int solution(int n) {
        return n / gcd(6,n);
    }


    public static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}