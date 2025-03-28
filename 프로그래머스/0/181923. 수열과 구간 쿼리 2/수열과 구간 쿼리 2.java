class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];
    
    for (int i = 0; i < queries.length; i++){
        int min = Integer.MAX_VALUE;
        boolean is_have = false;
        for (int x = queries[i][0]; x < queries[i][1]+1; x++){
            if (arr[x] > queries[i][2] && arr[x] < min){
                min = arr[x];
                is_have = true;
            }
        }
        if (is_have){
            answer[i] = min;
        }
        else answer[i] = -1;
    }
    return answer;
}
}