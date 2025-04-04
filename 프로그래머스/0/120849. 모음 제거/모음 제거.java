class Solution {
    public String solution(String my_string) {
    String answer = "";
    for (char i : my_string.toCharArray()){
        if (!"aeiou".contains(String.valueOf(i))){
            answer += String.valueOf(i);
        }
    }
    return answer;
}
}