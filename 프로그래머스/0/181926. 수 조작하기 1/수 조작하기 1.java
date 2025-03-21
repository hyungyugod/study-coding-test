class Solution {
    public int solution(int n, String control) {
    int answer = n;
    for (char i : control.toCharArray()){
        if (String.valueOf(i).equals("w")){
            answer += 1;
        }

        else if (String.valueOf(i).equals("s")){
            answer -= 1;
        }

        else if (String.valueOf(i).equals("d")){
            answer += 10;
        }

        else if (String.valueOf(i).equals("a")){
            answer -= 10;
        }
}
    return answer;
}
}