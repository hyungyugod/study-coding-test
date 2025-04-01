class Solution {
    public int solution(String A, String B) {
    int answer = 0;
    String BB = B + B;
    if (BB.contains(A)){
        return BB.indexOf(A);
    }

    else{
        return -1;
    }
}
}