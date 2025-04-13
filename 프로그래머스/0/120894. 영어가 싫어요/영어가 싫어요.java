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
    public long solution(String numbers) {
    String[] box = new String[]{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    List <String> map = Arrays.stream(box).collect(Collectors.toList());
    for (int i = 0; i < 10; i++){
        numbers = numbers.replace(map.get(i), String.valueOf(i));
    }
    return Long.parseLong(numbers);
}
}