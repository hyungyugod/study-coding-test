import java.util.ArrayList;
import java.util.List;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                int removeCount = arr[i];
                int currentSize = answer.size();

                if (removeCount <= currentSize) {
                    for (int k = currentSize - 1; k >= currentSize - removeCount; k--) {
                        answer.remove(k);
                    }
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
