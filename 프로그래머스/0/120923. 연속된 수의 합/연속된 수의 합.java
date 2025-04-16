class Solution {
    public int[] solution(int num, int total) {
    int [] answer = new int [num];
    int a1 = (total - ((num-1) * (num)/2))/ num;
    for (int i = a1; i < a1 + num; i++){
        answer[i - a1] = i;
    }
    return answer;
}
}