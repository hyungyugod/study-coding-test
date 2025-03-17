class Solution {
    public int solution(int a, int b) {
        int c = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int d = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return c >= d ? c : d;
    }
}