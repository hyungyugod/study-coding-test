import java.util.Arrays;
import java.util.stream.Stream;
class Solution {
    public int solution(String my_string) {
    return Arrays.stream(my_string.split("[a-zA-Z]+"))
                    .filter(s->!s.isEmpty())
                    .map(Integer::parseInt)
                    .reduce(0, (a,b) -> a + b);
}
}