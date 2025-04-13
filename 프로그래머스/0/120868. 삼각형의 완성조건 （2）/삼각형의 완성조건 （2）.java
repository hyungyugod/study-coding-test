class Solution {
    public int solution(int[] sides) {
    int answer = 0;

    int maxs = sides[0] > sides[1] ? sides[0] : sides[1];
    
    for (int i = 1; i < sides[0] + sides[1]; i++){
        int max = maxs > i ? maxs : i;
        int sum = sides[0] + sides[1] + i;
        if (2 * max < sum){
            answer++;
        }
    }
    return answer;
}
}