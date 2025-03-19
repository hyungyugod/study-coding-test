import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] x = Arrays.stream(num_list).sorted().toArray();
        int[] answer = Arrays.copyOfRange(x, 5,num_list.length);
        
        return answer;
    }
}