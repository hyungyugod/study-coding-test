class Solution {
    public String solution(String phone_number) {
    int pl = phone_number.length();
    return "*".repeat(pl - 4) + phone_number.substring(pl - 4, pl);
}
}