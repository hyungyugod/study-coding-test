class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    int[] answer = {};
    for (int[] x : queries){
        for (int i = x[0]; i <= x[1]; i++){
            if (i % x[2] == 0){
                arr[i] += 1;
            }
        }
    }
    return arr;
}
}