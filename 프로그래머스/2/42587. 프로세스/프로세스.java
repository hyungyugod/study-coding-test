import java.security.KeyStore.Entry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Scanner;
class Solution {
    public int solution(int[] priorities, int location) {
        Deque <Integer> queue = new ArrayDeque<>();
        boolean yet = true; // 해당 원소가 빠져나오면 false가 되면서 루프 종료
        int answer = 0; // 해당 원소 포함 몇명이나 나갔는지

        // location이 포인터 역할을 해서 해당 원소를 계속 따라감.

        for (int i = 0; i < priorities.length; i++){ // 큐에 배열 담기
            queue.offer(priorities[i]); 
        }

        while (yet) {
            if (location != 0){ // 주인공 차례가 아닐 때
                int num = queue.poll();
                boolean re = false; // 다시 돌아갔는지 확인

            for (int j : queue){ // 더 큰수가 있는지 확인하는 절차
                if (j > num){ // 더 큰 수가 존재하면 다시 들어가기
                    queue.offer(num);
                    location -= 1;
                    re = true;
                    break;
                }
            }

            if (!re){
            // 안돌아갔으면 나가고 나간 번째 수 + 1, 주인공 위치 1칸 줄어듦
            answer += 1;
            location -= 1;
            }
            
        }
            else { // 주인공 차례일때 
                int num = queue.poll(); // 주인공 꺼냄
                boolean re = false; // 다시 돌아갔는지 확인

                for (int j : queue){ // 더 큰수가 있는지 확인하는 절차
                    if (j > num){ // 더 큰 수가 존재하면 다시 들어가기
                        queue.offer(num);
                        location = queue.size() - 1; // 다시 뒤로가고 위치 재설정
                        re = true;
                        break;
                    }
                }

                if (!re) { // 안돌아갔으면
                    answer += 1; // 번째수를 증가시키고
                    yet = false; // 끝났음을 알림
                }
        }
    }

    return answer; // 번째수를 리턴
}
}