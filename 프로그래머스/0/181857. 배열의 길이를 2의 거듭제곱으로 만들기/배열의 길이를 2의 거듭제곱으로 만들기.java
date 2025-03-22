import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
    List <Integer> answer = new ArrayList<>();
    for (int i : arr){
        answer.add(i);
    }

    for (int i = 0; i < arr.length * 2; i++){
        if (arr.length <= Math.pow(2, i)){
            int z = (int) Math.pow(2, i) - arr.length;
            for (int j = 0; j < z; j++){
                answer.add(0);
            }
            break;
        }
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
}
}