import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr) {
        int arrLength = arr.length;
        int sidx = 0;
        for (int i = 0; i < arrLength; i++){
            if (arr[i] < arr[sidx]){
                sidx = i;
            } 
        }
        
        List<Integer> answer = new ArrayList<>();
        
        if (arrLength - 1 == 0) return new int[]{-1};
        
        for (int i = 0; i < arrLength; i++){
            if (i != sidx) {
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}