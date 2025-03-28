import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
    List <Integer> answer = new ArrayList<>();
    int a = 0;
    int b = 0;
    int c = 0;

    for (int i = 0; i < rank.length; i++){
        if(attendance[i]){
            answer.add(rank[i]);
        }
    }

    int[] arr = answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    
    for (int i = 0; i < rank.length; i++){
        if (rank[i] == arr[0]){
            a = i;
        }

        else if (rank[i] == arr[1]){
            b = i;
        }
        
        else if (rank[i] == arr[2]){
            c = i;
        }
    }

    return 10000 * a + 100 * b + c;
}
}