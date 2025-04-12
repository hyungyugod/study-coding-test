import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, String direction) {
    int[] answer = new int[numbers.length * 2];
    System.arraycopy(numbers, 0, answer, 0, numbers.length);
    System.arraycopy(numbers, 0, answer, numbers.length, numbers.length);
    if (direction.equals("right")){
        return Arrays.copyOfRange(answer, numbers.length - 1, numbers.length*2 - 1);
    }

    else {
        return Arrays.copyOfRange(answer, 1, numbers.length + 1);
    }
}
}