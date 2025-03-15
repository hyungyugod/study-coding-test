class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder(); // 문자열을 리스트처럼 쓸 수 있게 만듦듦

        for (char c : myString.toCharArray()) {  // java는 문자 하나를 다룰때는 char로 써야한다. + 문자열을 문자들의 합으로 만들어 주어야 한다.
            if (c == 'a') {         
                result.append('A'); // 소문자 'a'를 'A'로 변경
            } 
            else if (c != 'A' && Character.isUpperCase(c)) { // 문자열이 아니라 char 이므로 character의 isup을 사용한다.
                result.append(Character.toLowerCase(c)); // 대문자를 소문자로 변경
            } 
            else {
                result.append(c); // 변경할 필요 없는 문자
            }
        }
        
        return result.toString();
    }
}
