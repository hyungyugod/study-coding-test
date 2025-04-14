import java.util.Arrays;
class Solution {
    public int solution(int[][] dots) {
    int x1 = dots[0][0];
    int x2 = dots[0][0];
    int y1 = dots[0][1];
    int y2 = dots[0][1];

    for (int i = 1; i < dots.length; i++){
        if (dots[i][0] != x1){
            x2 = dots[i][0];
        }

        else if(dots[i][1] != y1){
            y2 = dots[i][1];
        }
    }
    return Math.abs(y2-y1) * Math.abs(x2-x1);
}
}