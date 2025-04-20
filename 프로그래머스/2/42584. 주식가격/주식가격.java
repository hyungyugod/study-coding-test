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
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] prices) {
    Stack <Integer> stack = new Stack<>(); // 스택 구현
    int priceLength = prices.length;
    int [] answer = new int[priceLength];

    for (int i = 0; i < priceLength; i++ ){ // 배열 전체를 순회

        while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) { // 이전에 스택에 넣어뒀던게 현재 위치값보다 작다면, peek은 empty 체크와 한 쌍 -> 연쇄작용으로 안작을때까지 pop
        int top = stack.pop(); // pop은 한번만 해야하므로 이렇게 선언하고 해야함.
        answer[top] = i - top; // 옛날 인덱스로부터 현재 인덱스까지 얼마나 멀어져 왔는가.
        }

        stack.push(i); // 앞선 숙제를 다 해결하고 나서야 위에 얹혀짐.

    }

    while (!stack.isEmpty()){
        int top = stack.pop(); 
        answer[top] = priceLength - 1 - top; // 마지막 인덱스와 현재 인덱스간의 거리
    }

    return answer;
}
}