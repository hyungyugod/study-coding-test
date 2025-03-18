import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] a = Arrays.copyOf(num_list, n);
        int[] b = Arrays.copyOfRange(num_list,n,num_list.length);
        int[] answer = new int[a.length + b.length];
        
        System.arraycopy(b,0, answer, 0, b.length); // 복사할때는 앞부터 순서대로 하기
        System.arraycopy(a, 0, answer, b.length, a.length); // b.length가 인덱스 +1이므로 딱 그전까지 b가 붙어있음.
        return answer;
    }
}