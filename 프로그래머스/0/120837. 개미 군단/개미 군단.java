class Solution {
    public int solution(int hp) {
        int a = hp / 5;
        int b = hp % 5;
        int c = b / 3;
        int d = b % 3;
        return a + c + d;
    }
}