import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
    List <Integer> answer = new ArrayList<>();
    for (int i = l; i < r + 1; i++){
        if(String.valueOf(i).matches("[05]+")){
            answer.add(i);
        }
    }
    if (answer.isEmpty()){
        return new int[]{-1};
    }
    else{
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
    
}

}