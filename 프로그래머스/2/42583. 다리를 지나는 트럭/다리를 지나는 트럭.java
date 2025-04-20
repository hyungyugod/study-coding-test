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
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Scanner;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    Queue<Truck> bridge = new LinkedList<>();
    int currentTime = 0;
    int totalWeight = 0;
    int idx = 0; // 현재 나갈 차례 트럭 인덱스

    while (idx < truck_weights.length || !bridge.isEmpty()) {
        currentTime++; // 시간이 우선 가고 시간이 갔는데 이제 나갈 시간인가? 판단 -> 나가는 트럭이 우선한다. 아래서 넣을수도 없고 빠지지도 않아도 시간은 간다.

        // 트럭이 다리에서 빠져나갈 시간인지 확인 (리스트 가장 앞의 원소를 확인)
        if (!bridge.isEmpty() && bridge.peek().exitTime == currentTime) {
            totalWeight -= bridge.poll().weight;
        }

        // 새로운 트럭을 넣을 수 있는지 확인 (배열에서 나갈차례의 원소를 확인)
        if (idx < truck_weights.length && totalWeight + truck_weights[idx] <= weight) {
            totalWeight += truck_weights[idx];
            bridge.offer(new Truck(truck_weights[idx], currentTime + bridge_length)); // 현재 시간 + 다리길이 -> 빠져나갈 시간
            idx++;
        }
    }

    return currentTime;
}

static class Truck { // solution 클래스 안에 정적 내부 클래스
        int weight;
        int exitTime;

        Truck(int weight, int exitTime) {
            this.weight = weight;
            this.exitTime = exitTime;
        }
    }
}