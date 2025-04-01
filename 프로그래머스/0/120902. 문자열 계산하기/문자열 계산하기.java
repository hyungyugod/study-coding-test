class Solution {
    public int solution(String my_string) {
    int answer = 0;
    String [] box = new String[]{"+"};

    for (String i : my_string.split(" ")){

        if (!i.matches("[0-9]+")){
            box[0] = i;
        }

        else {
            if (box[0].equals("+")){
                answer += Integer.parseInt(i);
            }

            else {
                answer -= Integer.parseInt(i);
            }
        }
    }
    return answer;
}
}