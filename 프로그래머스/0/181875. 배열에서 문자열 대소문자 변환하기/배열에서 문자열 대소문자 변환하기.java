import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String[] strArr) {
        int cnt = 0;
        List<String> answer = new ArrayList<>();
        for (String i:strArr){
            cnt += 1;
            if (cnt % 2 != 0){
                answer.add(i.toLowerCase());
            }
            else{
                answer.add(i.toUpperCase());
            }
        }
        return answer.toArray(new String[0]);
    }
}