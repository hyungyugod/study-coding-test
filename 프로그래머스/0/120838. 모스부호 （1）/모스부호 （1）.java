import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
    Map<String,String> morse = new HashMap<>();
    StringBuilder answer = new StringBuilder();

    String [] box = new String[] { 
        ".-","a","-...","b","-.-.","c","-..","d",".","e","..-.","f",
        "--.","g","....","h","..","i",".---","j","-.-","k",".-..","l",
        "--","m","-.","n","---","o",".--.","p","--.-","q",".-.","r",
        "...","s","-","t","..-","u","...-","v",".--","w","-..-","x",
        "-.--","y","--..","z"
    };

    for (int i = 0; i < box.length; i += 2){
        morse.put((box[i]), box[i+1]);
    }

    for (String i: letter.split(" ")){
        answer.append(morse.get(i));
        }
    
    return answer.toString();
}   
 
}