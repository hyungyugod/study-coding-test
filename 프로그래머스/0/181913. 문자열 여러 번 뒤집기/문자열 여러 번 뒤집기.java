class Solution {
    public String solution(String my_string, int[][] queries) {
    StringBuilder answer = new StringBuilder(my_string);
    StringBuilder box = new StringBuilder();

    for (int[]i : queries){
        box.append(answer.substring(i[0],i[1]+1));
        answer.replace(i[0], i[1]+1, box.reverse().toString());
        box.setLength(0);
    }

    return answer.toString();
}
}