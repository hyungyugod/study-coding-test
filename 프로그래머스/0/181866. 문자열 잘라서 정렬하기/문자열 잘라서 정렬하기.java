import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
    return  Arrays.stream(myString.split("x")).sorted().filter(x -> !x.isEmpty()).toArray(String[]::new);
}
}