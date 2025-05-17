class Solution {
    public String solution(String s) {
        int sn = s.length();
        if (sn % 2 == 0) return String.valueOf(s.charAt(sn / 2 - 1)) + String.valueOf(s.charAt(sn / 2));
        else return String.valueOf(s.charAt((sn - 1) / 2));
    }
}