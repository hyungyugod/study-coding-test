class Solution {
    public int solution(int num) {
    long n = num; // long형으로 캐스팅
    int answer = 0;
    
    while (n != 1) {
        if (answer == 500) return -1;
        if (n % 2 == 0) n /= 2;
        else n = n * 3 + 1;
        answer++;
    }
    return answer;
}

}