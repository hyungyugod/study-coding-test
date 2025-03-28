class Solution {
    public String solution(String code) {
    String answer = "";
    boolean mode = false;

    for (int i = 0; i < code.length(); i++){
        if(!mode){
            if(code.toCharArray()[i] != '1'){
                if (i % 2 == 0){
                    answer += String.valueOf(code.toCharArray()[i]);
                }
            }

            else {
                mode = true;
            }
        }

        else{
            if(code.toCharArray()[i] != '1'){
                if (i % 2 != 0){
                    answer += String.valueOf(code.toCharArray()[i]);
                }
            }

            else {
                mode = false;
            }
    }

    }

    if (answer.length() == 0){
        return "EMPTY";
    }

    else{
        return answer;
    }
        

}
}