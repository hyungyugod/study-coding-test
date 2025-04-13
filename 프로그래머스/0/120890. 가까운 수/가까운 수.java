import java.util.Arrays;
class Solution {
   public int solution(int[] array, int n) {
    Arrays.sort(array);
    int min_diff = Math.abs(n - array[0]);
    int answer_id = 0;
    
    for (int i = 1; i < array.length; i++) {
        int diff = Math.abs(n - array[i]);
        // 더 작은 차이가 발견되면 업데이트
        if (diff < min_diff) {
            min_diff = diff;
            answer_id = i;
        }
        // 동일한 차이면, 배열이 정렬되어 있으므로 기존 answer_id가 더 작은 값입니다.
    }
    
    return array[answer_id];
}

}