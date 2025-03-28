class Solution {
    public int[][] solution(int[][] arr) {
    int x = arr[0].length;
    if (arr.length > x){ // 내부 배열을 늘려야하는 경우
        int[][] answer = new int[arr.length][arr.length];
            for (int p = 0; p < arr.length ; p++){
                // 한칸 때서 절차대로 분류하기
                int[] ready = new int[arr.length];
                for (int i = 0; i < x; i++){
                    ready[i] = arr[p][i];
                }
                answer[p] = ready;
            }

            return answer;
    }

    else if (arr.length < x){ // 외부 배열에 맞게 0000..배열을 추가
        int[][] answer = new int[x][x];
        for (int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }

        return answer;
    }

    else { // 이미 정사각형인 경우
        return arr;
    }
}
}