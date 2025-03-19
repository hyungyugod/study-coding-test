import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List <Integer> answer = new ArrayList<>();
        for (int i : arr){
            if (!Arrays.stream(delete_list).boxed().collect(Collectors.toList()).contains(i)){
                answer.add(i);
            }
            
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}