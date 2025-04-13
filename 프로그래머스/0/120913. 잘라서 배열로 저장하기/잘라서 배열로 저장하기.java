class Solution {
    public String[] solution(String my_str, int n) {
    String[] answer = new String[(my_str.length()-1)/n + 1];

    for(int i = 0; i < my_str.length(); i += n){
        if (i+n < my_str.length()){
            answer[i/n] = my_str.substring(i, i+n);
        }

        else {
            answer[i/n] = my_str.substring(i,my_str.length());
        }
        
    }


    return answer;
}
}