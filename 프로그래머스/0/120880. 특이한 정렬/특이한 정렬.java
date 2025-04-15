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
    public int[] solution(int[] numlist, int n) {
    return Arrays.stream(numlist)
                    .boxed()
                    .sorted(Comparator.comparingInt((Integer a) -> Math.abs(n-a)).thenComparing(Comparator.reverseOrder()))
                    .mapToInt(Integer::intValue)
                    .toArray();
}
}