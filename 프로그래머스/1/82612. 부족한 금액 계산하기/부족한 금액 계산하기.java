import java.util.*;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = (long) price * ((count * (count + 1)) / 2) - money;
        return (long) Math.max(answer, 0);
    }
}