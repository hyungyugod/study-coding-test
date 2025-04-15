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
    public int solution(int[] array) {
    Map <Integer, Integer> counter = new HashMap<>();
    for (int i : array){
        counter.put(i, counter.getOrDefault(i, 0) + 1);
    }
    int maxV = Collections.max(counter.values()); 

    if (Collections.frequency(counter.values(), maxV) > 1){
        return -1;
    }

    for (Map.Entry<Integer, Integer> i : counter.entrySet()){
        if (i.getValue() == maxV){
            return i.getKey();
        }
    }
    return 0;
}
}