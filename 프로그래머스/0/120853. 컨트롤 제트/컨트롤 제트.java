import java.util.Arrays;
class Solution {
    public int solution(String s) {
    int answer = 0;
    return Arrays.stream(s.replace(" Z", "Z").split(" "))
                    .filter(i -> i.matches("-?\\d+"))
                    .mapToInt(Integer::parseInt)
                    .sum();
}
}