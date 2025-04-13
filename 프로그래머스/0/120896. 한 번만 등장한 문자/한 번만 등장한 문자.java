import java.util.ArrayList;
import java.util.Arrays;
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
    public String solution(String s) {
    List <String> answer = new ArrayList<>(); 
    Map <String,Integer> counter = new HashMap<>();
    for (char i : s.toCharArray()){
        String key = String.valueOf(i);
        counter.put(key, counter.getOrDefault(key, 0) + 1);
    }

    for (String i : counter.keySet()){
        if(counter.get(i) == 1){
            answer.add(i);
        }
    }
    return answer.isEmpty() ? "" : answer.stream().sorted().collect(Collectors.joining(""));
}
}