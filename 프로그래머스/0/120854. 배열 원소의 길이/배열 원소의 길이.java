import java.util.Arrays;
import java.util.stream.Stream;
class Solution {
    public int[] solution(String[] strlist) {
    return Arrays.stream(strlist).map(s->s.length()).mapToInt(Integer::intValue).toArray();
}
}