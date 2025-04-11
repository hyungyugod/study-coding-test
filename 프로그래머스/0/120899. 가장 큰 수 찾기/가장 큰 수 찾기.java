import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] array) {
    int x = Arrays.stream(array).max().getAsInt();
    int answer = 0;
    for (int i = 0; i < array.length; i++){
        if (array[i] == x){
            answer = i;
        }
    }
    return new int[]{x, answer};
}

}