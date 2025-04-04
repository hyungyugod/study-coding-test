class Solution {
    public int[] solution(int[] num_list) {
    int start = 0; int end = num_list.length-1;
    while (start < end){
        int tmp; 
        tmp = num_list[start];
        num_list[start++] = num_list[end];
        num_list[end--] = tmp;
    } 
    return num_list;
}
}