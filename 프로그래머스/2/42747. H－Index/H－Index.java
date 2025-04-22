import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    

public int solution(int[] citations) {
    // 1) 내림차순 정렬
    int[] sorted_array = Arrays.stream(citations)
                               .boxed()
                               .sorted(Comparator.reverseOrder())
                               .mapToInt(i -> i)
                               .toArray();

    int idx_pointer = 0;
    List<Integer> answer = new ArrayList<>();

    // 2) 조건이 깨지면 반복 중단하면서 h값(i+1)을 리스트에 추가
    while (idx_pointer < sorted_array.length) {
        if (sorted_array[idx_pointer] >= idx_pointer + 1) {
            // (i+1)편의 논문이 인용횟수 조건을 만족하면 h 후보로 추가
            answer.add(idx_pointer + 1);
        } else {
            // 내림차순이기 때문에 이후에는 모두 조건 불만족 → 중단
            break;
        }
        idx_pointer++;
    }

    // 3) 빈 리스트면 0, 아니면 최대 h 반환
    return answer.isEmpty()
         ? 0
         : Collections.max(answer);
}

}