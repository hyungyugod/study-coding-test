class Solution {
    public int solution(int n) {
        if(n<4){
            return 0;
        }
        int answer = 1; 
        for (int i = 3; i < n+1; i += 2){
            boolean is_prime = true; 
            for (int j = 1; j < Math.sqrt(i) + 1; j++){
                if (i % j == 0 && j != 1){
                    is_prime = false;
                    break;
                }
            }
            if (is_prime){
                answer += 1;
            }
        }
            
        return n - answer -1;
    }
}