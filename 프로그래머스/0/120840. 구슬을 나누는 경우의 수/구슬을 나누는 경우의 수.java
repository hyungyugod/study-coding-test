import java.math.BigInteger;
class Solution {
    public static BigInteger fac(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 2; i < n + 1; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static BigInteger solution(int balls, int share) {
        if (balls == share){
            return BigInteger.ONE;
        }
        else{
            return fac(balls).divide(fac(balls - share).multiply(fac(share)));
        }
}
}