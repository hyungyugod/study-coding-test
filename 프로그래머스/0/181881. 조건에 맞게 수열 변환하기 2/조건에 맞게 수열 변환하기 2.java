import java.util.Arrays;

class Solution {
    public static int solution(int[] arr) {
    int answer = 0;
    int[] arr2 = new int[arr.length];
    while (!Arrays.equals(arr, arr2)){
        if (answer > 0){
            arr = arr2;
            arr2 = new int[arr.length];
        }

        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 2 == 0 && arr[i] >= 50){
                arr2[i] = arr[i]/2;
            }
            else if (arr[i] % 2 != 0 && arr[i] < 50){
                arr2[i] = arr[i] * 2 + 1;
            }
        }
        answer += 1;
    }
    return answer - 2;
}
}