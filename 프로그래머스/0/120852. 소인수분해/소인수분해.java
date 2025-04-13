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
    public int[] solution(int n) {
    List <Integer> answer = new ArrayList<>();
    int[] net = new int[n+1];
    for (int i = 2 ; i < n+1; i++){
        if (n % i == 0 && net[i] == 0){
            answer.add(i);
            for (int j = i; j < n+1; j += i){
                net[j] = 1;
            }
        }
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
}


}