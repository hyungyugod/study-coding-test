class Solution {
    public int solution(int a, int b) {
    int x = b/gcd(a,b);
    while (x % 2 == 0 || x % 5 == 0){
        if (x % 2 == 0){
            x /= 2;
        }

        else if (x % 5 == 0){
            x /= 5; 
        }
    }

    if (x == 1){
        return 1;
    }

    return 2;
}

public static int gcd(int a, int b){
    if(b==0) return a;
    return gcd(b,a%b);
}
}