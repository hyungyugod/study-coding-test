import java.util.Arrays;
class Solution {
    public int solution(int[] arr, int idx) {
        int[] a = Arrays.copyOfRange(arr, idx, arr.length);
        for (int i = 0; i < a.length; i++){
            if (a[i] == 1){
                return i + idx;
            }
        }
        return -1;
    }
}