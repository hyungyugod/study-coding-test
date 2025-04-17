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
    public int solution(int[] nums) {
    int N = nums.length; // 포켓몬의 총 마리수
    Set <Integer> types = new HashSet<>();

    for (int i : nums){ // 배열의 모든 원소를 집합에 넣음.
        types.add(i); 
    }

    return Math.min(N/2, types.size()); // 최대한 많은 종류를 N/2 안에서 선택하기 위해서
}
}