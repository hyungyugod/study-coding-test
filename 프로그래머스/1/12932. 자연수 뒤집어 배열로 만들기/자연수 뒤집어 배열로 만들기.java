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
    public int[] solution(long n) {
    Deque <Integer> answer = new ArrayDeque<>();

    for (String i : String.valueOf(n).split("")){
        answer.push(Integer.parseInt(i));
    }

    return answer.stream().mapToInt(i -> i).toArray();
}
}