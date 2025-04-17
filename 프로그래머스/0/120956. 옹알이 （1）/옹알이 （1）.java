class Solution {
    public int solution(String[] babbling) {
    int answer = 0;
    for (String i : babbling){
        if(i.contains("aya")){
            i = i.replace("aya", "-");
        }

        if(i.contains("ye")){
            i = i.replace("ye", "-");
        }

        if(i.contains("woo")){
            i = i.replace("woo", "-");
        }

        if(i.contains("ma")){
            i = i.replace("ma", "-");
        }

        i = i.replace("-", "");

        if (i.isEmpty()){
            answer += 1;
        }
        
    }
    return answer;
}
}