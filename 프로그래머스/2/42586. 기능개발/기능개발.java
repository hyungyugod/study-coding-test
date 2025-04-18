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
    public int[] solution(int[] progresses, int[] speeds) {
    List <Integer> answer = new ArrayList<>(); // 정답을 저장할 리스트
    Deque <Integer> stack = new ArrayDeque<>(); // 꺼내보면서 확인할 deque
    int count = 0;
    int idx = 0;

    for (int i : progresses){
        stack.addLast(i); // 리스트에 값 넣는 것처럼 똑같이 넣음.
    }

    while(!stack.isEmpty()){
        count++; // 진행된 회기
        if (stack.peek() + count * speeds[idx] >= 100){ // speeds[idx] = 진행된 회기 * 해당 값의 speed
            int deployment = 0;
            while (!stack.isEmpty() && stack.peek() + count * speeds[idx] >= 100){ // 100 넘으면 꺼내고 speed 인덱스와 배포수를 1 증가
                stack.pop();
                deployment++;
                idx++;
            }
            answer.add(deployment);
        }
    }
    return answer.stream().mapToInt(i -> i).toArray();
}

}