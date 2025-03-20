import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public String[] solution(String[] strArr) {
        List <String> answer = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++){
            if (!strArr[i].contains("ad")){
                answer.add(strArr[i]);
            }
        }
        return answer.toArray(new String[0]);
    }
}