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
    
public String[] solution(String[] quiz) {
    List <String> answer = new ArrayList<>();
    for (String i: quiz){
        if(Arrays.stream(i.replace(" - ", " -").replace(" + ", " ").replace(" = ", " -").replace("--","").split(" "))
                .mapToInt(Integer :: parseInt)
                .sum() == 0) {
            answer.add("O");
        }

        else {
            answer.add("X");
        }
    }
    return answer.toArray(new String[0]);
}
}