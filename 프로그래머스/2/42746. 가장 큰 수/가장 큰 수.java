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
    public String solution(int[] numbers) {
    String result = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            // 두 문자열을 합쳐서 큰 수가 되도록 정렬
            .sorted((a, b) -> (b + a).compareTo(a + b))
            .collect(Collectors.joining());

    // 모든 값이 0인 경우 "000..."이 되므로 "0"으로 처리
    return result.startsWith("0") ? "0" : result;
}
}