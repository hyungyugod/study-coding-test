class Solution {
    public int solution(String[] order) {
    int answer = 0;
    for (String i : order){
        if (i.endsWith("americano") || i.startsWith("americano")) answer += 4500;
        else if (i.endsWith("cafelatte") || i.startsWith("cafelatte")) answer += 5000;
        else answer += 4500;
    }
    return answer;
}
}