import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

class Solution {
    public int solution(int a, int b, int c, int d) {
    Set <Integer> answer = new HashSet<>(Arrays.asList(a, b, c, d));
    
    if (answer.size() == 1){
        return a * 1111;
    }

    else if (answer.size() == 4){
        int min = Integer.MAX_VALUE;
        for (int i : answer){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    else if (answer.size() == 2){
        List <Integer> x = new ArrayList<>(3);
        List <Integer> y = new ArrayList<>(3);
        x.add(a);
        for (int i : new int[]{b, c, d}){
            if (x.contains(i)){
                x.add(i);
            }

            else {
                y.add(i);
            }
        }

        if (x.size() == y.size()){
            int p = x.get(0);
            int q = y.get(0);

            return (p + q) * Math.abs(p - q);
        }

        else {
            int q = y.get(0);
            if (x.size() == 3){
                return (10 * a + q) * (10 * a + q);
            }
        
            else{
                return (10 * q + a) * (10 * q + a);
            }
        }
    }

    else {
        List <Integer> x = new ArrayList<>(4);
        x.add(a);
        int p = 0;

        for (int i : new int[]{b, c, d}){
            if (x.contains(i)){
                p = i;
                break;
            }
            x.add(i);
        }

        answer.remove(p);
        
        int ans = 1;

        for (int i : answer){
            ans *= i;
        }

        return ans;
    }
}

}