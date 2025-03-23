import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String myStr) {
    List <String> answer = new ArrayList<>();
    for (String i :myStr.split("[abc]")){
        if (!i.isEmpty()){    // 공백이 아니면 리스트에 값을 추가한다.
            answer.add(i);
        }
    }

    if (answer.size() == 0){
        return new String[]{"EMPTY"};
    }

    
    return answer.toArray(new String[0]);
}
}