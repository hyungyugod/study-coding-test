class Solution {
    boolean solution(String s) {
    boolean answer = true;
    int cntp = 0;
    int cnty = 0;
    s = s.toLowerCase();

    for (char i : s.toCharArray()) {
        if (i == 'p'){
            cntp++;
        }

        else if (i == 'y') {
            cnty++;
        }
    }
    return cntp == 0 && cnty == 0 ? true : (cntp == cnty ? true : false );
}
}