class Solution {
    public int[][] solution(int[] num_list, int n) {
    int[][] answer = new int[num_list.length / n][n];
    for (int i = 0; i < num_list.length; i += n){
        int [] box = new int[n];
        for (int j = i; j < i + n; j ++){
            box[j%n] = num_list[j];
        }
        answer[i/n] = box;
    }
    return answer;
}
}