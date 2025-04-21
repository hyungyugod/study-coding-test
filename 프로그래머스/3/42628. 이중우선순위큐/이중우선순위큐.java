import java.security.KeyStore.Entry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Scanner;
class Solution {
    public int[] solution(String[] operations) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();


    for (String i : operations){
        String [] cmd = i.split(" ");

        if (cmd[0].equals("I")){ // 만약 I로 시작한다면 정수를 추가한다.
            heap.offer(Integer.parseInt(cmd[1])); 
        }

        else if (cmd[0].equals("D") && cmd[1].equals("-1") && !heap.isEmpty()){ // 비어있지 않으면서 d-1이면 최솟값 삭제
            heap.poll();
        }

        else if (cmd[0].equals("D") && cmd[1].equals("1") && !heap.isEmpty()){ // 비어있지 않으면서 d-1이면 최댓값 삭제
            heap.remove(Collections.max(heap));
        }
    }

    if (heap.isEmpty()){
        return new int[]{0,0};
    }

    else {
        int high = Collections.max(heap);
        int low = heap.poll();
        return new int[]{high, low};
    }
}
}