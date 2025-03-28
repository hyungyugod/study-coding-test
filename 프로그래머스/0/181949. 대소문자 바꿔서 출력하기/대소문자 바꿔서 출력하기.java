import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder answer = new StringBuilder();
    String a = sc.next();

    for (char i : a.toCharArray()){
        if (i <= 'z' && i >= 'a'){
            answer.append(Character.toUpperCase(i));
        }

        else {
            answer.append(Character.toLowerCase(i));
        }
    }

    System.out.println(answer.toString());

}
}