import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
   public int solution(int i, int j, int k) {
    String kS = String.valueOf(k); 
    return (int) IntStream.rangeClosed(i, j)
        .mapToObj(String::valueOf)
        .flatMap(s -> Arrays.stream(s.split("")))
        .filter(s -> s.equals(kS))
        .count();
}
}