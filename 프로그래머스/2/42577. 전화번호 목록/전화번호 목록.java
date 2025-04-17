import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Scanner;
class Solution {
    public boolean solution(String[] phone_book) {
    Set <String> pset = new HashSet<>(Arrays.asList(phone_book)); // Arrays 클래스를 통해 리스트로 바꾼후 set으로 전환

    for (String i : phone_book){
        String prefix = "";
        for (int j = 0; j < i.length()-1; j++){ // 완전 같은 값은 없으므로 그 전까지만 검사
            prefix += i.charAt(j);
            if (pset.contains(prefix)){
                return false;
            }            
        } 
    }
    return true;
}
}