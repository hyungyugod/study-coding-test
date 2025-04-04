import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
    int[] answer = Arrays.stream(numbers).sorted().toArray();
    return answer[answer.length-1] * answer[answer.length-2];
}
}