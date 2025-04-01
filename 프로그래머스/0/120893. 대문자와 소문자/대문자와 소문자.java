class Solution {
    public String solution(String my_string) {
    StringBuilder answer = new StringBuilder();
    for (char i : my_string.toCharArray()){
        if (Character.isUpperCase(i)){
            answer.append(Character.toLowerCase(i));
        }

        else {
            answer.append(Character.toUpperCase(i));
        }
    }
    return answer.toString();
}
}