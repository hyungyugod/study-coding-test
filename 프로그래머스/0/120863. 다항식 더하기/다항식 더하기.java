class Solution {
    public String solution(String polynomial) {
    int xn = 0;
    int n = 0;

    for (String term : polynomial.split(" \\+ ")) {
        if (term.contains("x")) {
            // "x" 단독 처리
            if (term.equals("x")) {
                xn += 1;
            } else {
                xn += Integer.parseInt(term.replace("x", ""));
            }
        } else {
            n += Integer.parseInt(term);
        }
    }

    // 결과 조합
    StringBuilder result = new StringBuilder();
    if (xn != 0) {
        if (xn == 1) result.append("x");
        else result.append(xn).append("x");
    }
    if (n != 0) {
        if (result.length() > 0) result.append(" + ");
        result.append(n);
    }

    return result.toString();
}



}