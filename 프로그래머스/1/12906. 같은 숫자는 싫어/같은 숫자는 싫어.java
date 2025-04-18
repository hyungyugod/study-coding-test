import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    List <Integer> waiting = new ArrayList<>();
    List <Integer> answer = new ArrayList<>();
    for (int i : arr){
        int last_id = waiting.size()-1;
        if (waiting.isEmpty()){
            waiting.add(i);
        }

        else if (waiting.get(last_id) != i){
            answer.add(waiting.get(last_id));
            waiting.remove(last_id);
            waiting.add(i);
        }
    }

    if (waiting.size() > 0){ // 남은 거 처리
        answer.add(waiting.get(waiting.size()-1));
    }

    return answer.stream().mapToInt(i -> i).toArray();
}
}