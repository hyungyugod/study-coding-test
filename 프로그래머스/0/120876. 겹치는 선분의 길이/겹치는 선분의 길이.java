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
    public int solution(int[][] lines) {
    int answer = 0;
    Map <Integer, Integer> counter = new HashMap<>();
    for (int[] i : lines){
        for (int j = i[0]; j < i[1]; j++){
            counter.put(j, counter.getOrDefault(j, 0) + 1);
        }    
    }

    for (Integer i : counter.values()){
        if (i >= 2){
            answer += 1;
        }
    }
    return answer;
}
}