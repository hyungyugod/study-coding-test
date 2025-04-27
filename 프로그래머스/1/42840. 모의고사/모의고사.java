import java.security.KeyStore.Entry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Scanner;
class Solution {
    public int[] solution(int[] answers) {
    int[] first = new int[]{1, 2, 3, 4, 5}; // 첫번째 사람의 찍는 루틴
    int[] sec = new int[]{2, 1, 2, 3, 2, 4, 2, 5}; // 두번째 사람의 찍는 루틴
    int[] trd = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 세번째 사람의 찍는 루틴

    int[] scores = new int[3]; // 인덱스 + 1번 선수의 점수를 보관하는 배열

    for (int i = 0 ; i < answers.length; i++){
        if (answers[i] == first[i % 5]) scores[0]++;
        if (answers[i] == sec[i % 8]) scores[1]++;
        if (answers[i] == trd[i % 10]) scores[2]++;
    }

    int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
    List <Integer> answer = new ArrayList<>();

    for (int j = 0; j < 3; j++){
        if(maxScore == scores[j]){
            answer.add(j + 1); 
        }
    }
    return answer.stream().sorted().mapToInt(i -> i).toArray();
}
}