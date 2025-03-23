class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    for (int[] i : queries){
        int tmp = arr[i[0]];
        arr[i[0]] = arr[i[1]];
        arr[i[1]] = tmp;
    }
    return arr;
}
}