class Solution {
    public int solution(int a, int b) {
        int z = (int) Math.pow(10, (int) Math.log10(b) + 1); // b의 자리수를 구하여 10^자리수 계산
        int c = a * z + b; // ⊕ 연산 수행
        int d = 2 * a * b; // 2 * a * b 계산
        return Math.max(c, d); // 더 큰 값 반환
    }
}
