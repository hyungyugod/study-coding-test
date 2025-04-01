class Solution {
    public int solution(int num, int k) {
    String nums = Integer.toString(num);
    String ks = Integer.toString(k);

    return nums.contains(ks) ? nums.indexOf(ks) + 1: -1;
}
}