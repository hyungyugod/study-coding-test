class Solution {
    public int[] solution(String myString) {
        String[] m = myString.split("x",-1);
        int[] answer = new int[m.length];
        for (int i = 0; i < m.length; i++){
            answer[i] = m[i].length();
        }

        return answer;
    }
}