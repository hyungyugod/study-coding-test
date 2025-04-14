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
    public int solution(String[] spell, String[] dic) {
    String spellstring = Arrays.stream(spell).sorted().collect(Collectors.joining(""));

    for (String i : dic){
        if(Arrays.stream(i.split("")).sorted().collect(Collectors.joining("")).equals(spellstring)){
            return 1;
        }
    }


    return 2;
}
}