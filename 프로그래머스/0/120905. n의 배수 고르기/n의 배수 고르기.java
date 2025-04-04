import java.util.Arrays;
import java.util.stream.Stream;
class Solution {
    public int[] solution(int n, int[] numlist) {
    return Arrays.stream(numlist).filter(s -> s % n == 0).toArray();
}
}