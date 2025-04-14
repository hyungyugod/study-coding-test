import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[][] score) {

    int scoreln = score.length;

    List <Integer> box = new ArrayList<>();
    int[] answer = new int[scoreln];

    for (int i =0; i < scoreln; i++){
        box.add(score[i][0] + score[i][1]);
    }

    box.sort(Comparator.reverseOrder());

    for (int i =0; i < scoreln; i++) {
        answer[i] = box.indexOf(score[i][0] + score[i][1]) + 1;
    }
    
    return answer;
}
}