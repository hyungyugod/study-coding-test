class Solution {
    public int solution(int[] num_list) {
        int x = 1;
        int p = 0;
        for (int i: num_list){
            x *= i;
            p += i;
        }
        return x < p*p? 1:0;
    }
}