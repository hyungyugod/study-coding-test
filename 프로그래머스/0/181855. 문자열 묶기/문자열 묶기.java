import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
    int max_length = 0;
    for (String i : strArr){
        if (max_length < i.length()){
            max_length = i.length();
        }
    }

    int[] answer = new int[max_length + 1];
    for (String i : strArr){
        answer[i.length()] += 1;
    }

    return Arrays.stream(answer).max().getAsInt();
}
}