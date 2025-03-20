import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] a = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] b = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        int[] answer = new int[a.length + b.length];

        System.arraycopy(a, 0, answer, 0, a.length);
        System.arraycopy(b, 0, answer, a.length, b.length);

        return answer;
    }
}