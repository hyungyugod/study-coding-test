class Solution {
    public int solution(String my_string) {
    int answer = 0;
    for (char i : my_string.toCharArray()){
        if (Character.isDigit(i)){
            answer += Integer.parseInt(String.valueOf(i));
        }
    }
    return answer;
}
}