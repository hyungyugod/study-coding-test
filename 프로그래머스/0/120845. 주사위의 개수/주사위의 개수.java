import java.util.Arrays;
import java.util.stream.Stream;
class Solution {
    public int solution(int[] box, int n) {
    return Arrays.stream(box).map(i -> i / n).reduce((a,b) -> a*b).getAsInt();
}
}