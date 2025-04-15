class Solution {
    public int solution(int n) {
    int answer = 1;
    for (int i = 0; i < n; i++){ 
        while (Integer.toString(answer).contains("3") || answer % 3 == 0){
            answer += 1;
        }
        answer += 1;
        
    }
    return answer - 1;
}
}