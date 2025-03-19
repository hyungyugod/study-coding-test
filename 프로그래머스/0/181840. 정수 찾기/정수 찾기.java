import java.util.Arrays;
class Solution {
    public int solution(int[] num_list, int n) {
        boolean answer = Arrays.stream(num_list).anyMatch(num -> num == n);
        return answer ? 1 : 0;
    }
}