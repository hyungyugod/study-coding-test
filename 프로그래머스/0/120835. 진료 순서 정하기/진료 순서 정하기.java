import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
    int[] answer = new int[emergency.length];
    List <Integer> copyE = Arrays.stream(emergency)
                                    .boxed()
                                    .sorted(Comparator.reverseOrder())
                                    .collect(Collectors.toList());
                                    
    for (int i = 0; i < emergency.length; i++){
        answer[i] = copyE.indexOf(emergency[i]) + 1;
    }
    
    return answer;
}
}