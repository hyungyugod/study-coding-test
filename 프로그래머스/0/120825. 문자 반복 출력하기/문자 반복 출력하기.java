class Solution {
    public String solution(String my_string, int n) {
    StringBuilder answer = new StringBuilder();
    for (char i : my_string.toCharArray()){
        answer.append(String.valueOf(i).repeat(n));
    }
    return answer.toString();
}

}