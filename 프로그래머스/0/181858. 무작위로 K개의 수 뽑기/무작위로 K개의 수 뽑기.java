import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
    List <Integer> answer = new ArrayList<>();
    Set<Integer> box = new HashSet<>(); 

    for (int i : arr){
        if (!box.contains(i) && answer.size() < k){
            answer.add(i);
            box.add(i);
        }
    }

    if (answer.size() < k){
        int x = answer.size();
        for (int i = 0 ; i < k-x; i++){
            answer.add(-1);
        }
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
}
}