class Solution {
    public String[] solution(String[] picture, int k) {
    String[] answer = new String[picture.length * k];
    int cnt = 0;

    for (int i = 0; i < picture.length; i++){

        StringBuilder box = new StringBuilder();
        for (char x : picture[i].toCharArray()){
            box.append(String.valueOf(x).repeat(k));
        }

        for (int z = 0; z < k; z++){
            answer[cnt] = box.toString();
            cnt++;
        }
        
    }
    return answer;
}

}