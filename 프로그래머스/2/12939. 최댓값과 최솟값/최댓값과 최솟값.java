class Solution {
    public String solution(String s) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (String i : s.split(" ")){
        int present = Integer.parseInt(i);

        if (present > max){
            max= present;
        }

        if (min > present){
            min = present;
        }
    }

    return min + " " + max;
}
}