class Solution {
    public int[] solution(int[] num_list) {
    int cnt = 0;
    for (int i : num_list){
        if (i % 2 == 0){
            cnt++;
        }
    }
    return new int[]{cnt, num_list.length-cnt};
}
}