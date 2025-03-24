import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
    int first = -1;
    int last = -1;
    for (int i = 0; i < arr.length; i++){
        if (first == -1 && arr[i] == 2){
            first = i;
        }
        if (arr[i] == 2){
            last = i;
        }
    }
    if (first == last && first != -1){
        return new int[]{arr[last]};
    }
    else if (first == -1){
        return new int[]{-1};
    }

    else{
        return Arrays.copyOfRange(arr, first, last+1);
    }
}
}