class Solution {
    public String solution(String my_string, int[][] queries) {
    char[] char_string = my_string.toCharArray();

    int start;
    int end;

    for (int[] i : queries){
            start = i[0];
            end = i[1];
        while (start < end){
            char tmp;
            tmp = char_string[start];
            char_string[start] = char_string[end];
            char_string[end] = tmp;
            start++;
            end--;
        }
    }
    
    return new String(char_string);
}
}