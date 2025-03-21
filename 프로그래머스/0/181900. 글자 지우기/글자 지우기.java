class Solution {
    public String solution(String my_string, int[] indices) {
    String answer = "";
    for (int i = 0; i < my_string.length(); i++){
        boolean is_in = true; 
        for (int j : indices){
            if (j == i){
                is_in = false;
                break;
            }
        }
    if (is_in){
        answer += String.valueOf(my_string.charAt(i));
    }
    }
    return answer;
}
}