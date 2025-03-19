class Solution {
    public String solution(String myString) {
        for (int i = 0; i < myString.length(); i++){
            String a = String.valueOf(myString.charAt(i));
            if ("abcdefghijk".contains(a)){
                myString = myString.replace(a, "l");
            }

        } 
        return myString;
    }
}