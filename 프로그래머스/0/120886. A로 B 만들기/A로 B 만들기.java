import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
    String[] bf = before.split("");
    String[] af = after.split("");

    Arrays.sort(bf);
    Arrays.sort(af);

    return Arrays.equals(bf,af) ? 1:0 ;
}
}