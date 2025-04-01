class Solution {
    public int solution(int[] array) {
    int answer = 0;
    for (int i : array){
        for (char j : Integer.toString(i).toCharArray()){
            if (j == '7'){
                answer += 1;
            }
        }
    }
    return answer;
}
}