import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Scanner;
class Solution {
    public int solution(String[][] clothes) {
    Map <String, Integer> counter = new HashMap<>();

    for (String[] i : clothes){
        counter.put(i[1], counter.getOrDefault(i[1], 1) + 1); // 옷의 종류가 나올때마다 개수를 추가
    }
    return counter.values().stream().reduce(1, (a,b) -> a * b) - 1;
}
}