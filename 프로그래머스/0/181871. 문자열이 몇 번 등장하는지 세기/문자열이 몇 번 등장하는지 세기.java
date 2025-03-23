class Solution {
    public int solution(String myString, String pat) {
    int answer = 0;
    int index = 0;
    while (myString.indexOf(pat, index) !=- 1){ // 더 이상 목표 문자열이 남지 않았을때 종료료
        index = myString.indexOf(pat, index); // index를 찾은 문자열이 시작하는 지점으로 옮기기
        index++; // 거기서 한 칸 더더
        answer++;
    }
    return answer;
    
}
}