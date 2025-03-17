class Solution {
    public int solution(String myString, String pat) {
        String m = myString.toLowerCase();
        String p = pat.toLowerCase();
        return m.contains(p) ? 1:0;
    }
}