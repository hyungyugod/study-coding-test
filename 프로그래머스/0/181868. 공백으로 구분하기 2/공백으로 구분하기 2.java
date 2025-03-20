import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public String[] solution(String my_string) {
        List <String> answer = new ArrayList<>();
        String[] m = my_string.split(" ");
        for (int i = 0; i < m.length; i++){
            if (!m[i].equals("")){
                answer.add(m[i]);
            }
        }
        return answer.toArray(new String[0]);
    }
}