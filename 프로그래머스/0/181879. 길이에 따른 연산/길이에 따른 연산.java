class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int product = 1;

        if (num_list.length >= 11) { // 배열 크기 확인
            for (int num : num_list) {
                sum += num; // 요소의 합 계산
            }
            return sum;
        } else {
            for (int num : num_list) {
                product *= num; // 요소의 곱 계산
            }
            return product;
        }
    }
}
