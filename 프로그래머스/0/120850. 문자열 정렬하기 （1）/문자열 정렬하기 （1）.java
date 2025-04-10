import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String my_string) {
    return Arrays.stream(my_string.split("")).filter(s -> s.matches("\\d+")).mapToInt(Integer :: parseInt).sorted().toArray();
}
}