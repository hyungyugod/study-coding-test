class Solution {
    public int[] solution(String my_string) {
    int[] answer = new int[52];
    for (char i : my_string.toCharArray()){
        if (i <= 'z' && i >= 'a'){
            answer[i - 'a' + 26] += 1;
        }

        else {
            answer[i-'A'] += 1;
        }
    }
    return answer;
}
}