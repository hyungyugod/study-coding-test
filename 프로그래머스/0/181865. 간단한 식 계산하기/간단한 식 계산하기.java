class Solution {
    public static int solution(String binomial) {
        String[] a = binomial.split(" ");
        if (a[1].equals("+")){
            return Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
        }

        else if(a[1].equals("-")){
            return Integer.parseInt(a[0]) - Integer.parseInt(a[2]);
        }

        else{
            return Integer.parseInt(a[0]) * Integer.parseInt(a[2]);
        }
    }
}