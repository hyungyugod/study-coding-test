class Solution {
    public String solution(String myString, String pat) {
    int index = 0;
    while (myString.indexOf(pat, index) != -1){
        index = myString.indexOf(pat, index);
        index++;
    }
    
    return myString.substring(0, index - 1 + pat.length());
    
}
}