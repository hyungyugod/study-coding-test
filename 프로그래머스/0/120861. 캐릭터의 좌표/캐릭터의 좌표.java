class Solution {
   public int[] solution(String[] keyinput, int[] board) {
    int[] answer = new int[2];
    for (String i : keyinput){
        if (i.equals("left")) {
                if (answer[0] > -1 * board[0]/2){
                    answer[0] -= 1;
                }
            }

            
        if (i.equals("right")) {
                if (answer[0] < board[0]/2){
                    answer[0] += 1;
                }
        }
        
        if (i.equals("up")) {
                if (answer[1] < board[1]/2){
                    answer[1] += 1;
                }
        }
            
        if (i.equals("down")) {
                if (answer[1] > -1 * board[1]/2){
                    answer[1] -= 1;
                }
        }
    }
    return answer;
}
}