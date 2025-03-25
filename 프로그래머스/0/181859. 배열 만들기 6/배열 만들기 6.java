import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
    List <Integer> stk = new ArrayList<>();
    int i = 0;
    while (i < arr.length){
        if (stk.size() == 0){
            stk.add(arr[i]);
            i += 1;
        }
        else if (stk.size() > 0 && stk.get(stk.size()-1) == arr[i] ){
            stk.remove(stk.size()-1);
            i += 1;
        }

        else if (stk.size() > 0 && stk.get(stk.size()-1) != arr[i]){
            stk.add(arr[i]);
            i += 1;
        }
    }
    if (stk.size() == 0){
        return new int[]{-1};
    }
    return stk.stream().mapToInt(Integer::intValue).toArray();
}
}