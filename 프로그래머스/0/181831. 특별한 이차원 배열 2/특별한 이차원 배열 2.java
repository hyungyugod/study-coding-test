class Solution {
    public static int solution(int[][] arr) {
        boolean is_true = true;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j] != arr[j][i]){
                    is_true = false;
                    break;
                }
            }
        }
        return is_true ? 1:0;
    }
}