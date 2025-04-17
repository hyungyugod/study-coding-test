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
    public String solution(String[] participant, String[] completion) {
    Map <String, Integer> partiMap = new HashMap<>();
    
    for (String i : participant){
        partiMap.put(i, partiMap.getOrDefault(i, 0) + 1);
    }

    for (String i : completion){
        partiMap.put(i, partiMap.get(i) - 1);
        if (partiMap.get(i) == 0){
            partiMap.remove(i);
        }
    }



    return partiMap.keySet().iterator().next();
}
}