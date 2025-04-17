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
    public int[] solution(String[] genres, int[] plays) {
    Map <String, Integer> genreTotalMap = new HashMap<>(); // 장르 - 장르별 곡 수 합 //정렬 기준 1
    Map <String, List<Song>> genreSongMap = new HashMap<>(); // 장르 - 음악(인덱스, 재생수)정보 // 정렬기준 2
    List <Integer> answer = new ArrayList<>(); // 정답을 담을 리스트 생성

    // 1. 장르별 총 재생 수와 곡 목록 구성
    for (int i = 0; i < genres.length; i++){
        String genre = genres[i]; // 두번 이상 사용될 변수들은 그냥 미리 선언하고 가면 편하다.
        int play = plays[i];

        
        genreTotalMap.put(genre, genreTotalMap.getOrDefault(genre, 0) + play); // genreTotalMap에 정보저장
        
        genreSongMap.putIfAbsent(genre, new ArrayList<>()); // 장르와 연결된 리스트 생성 (여기에 곡들을 최대 2개까지 담을 거)
        // 이미 리스트가 존재하면 두고 아니면 만듦
        genreSongMap.get(genre).add(new Song(i, play)); // 리스트에 첫번째 곡을 추가
    }

    // 2. 장르별 재생 수로 장르 정렬
        List<String> sortedGenres = new ArrayList<>(genreTotalMap.keySet()); // keyset은 컬렉션이니까 이렇게 넣어서 리스트로 만듦.
        sortedGenres.sort((a,b) -> genreTotalMap.get(b) - genreTotalMap.get(a)); // 플레이수가 큰 순서대로 장르를 내림차순으로 정렬함.

    // 3. 장르별로 곡 정렬 (재생 수 내림차순 정렬 후 2개까지 선택) - 위에서 정렬한 순서대로 두번째 맵을 순회

        for (String genre : sortedGenres){ // 장르를 순서대로 꺼냄 -> 장르랑 매칭되어있는 노래를 찾기 위하여
            List<Song> tmpSonglList = genreSongMap.get(genre); // 장르별 음악 리스트 이름을 보기 쉽게 재정의함.
            
            tmpSonglList.sort((a,b) -> b.play - a.play); // 재생 수를 기준으로 내림차순 정리 -> 정렬된 채로 저장

            for (int i = 0; i < Math.min(2, tmpSonglList.size()); i++){ // 최대 2개까지만 꺼내서 답에 입력
                answer.add(tmpSonglList.get(i).idx); // song 객체의 idx를 답에 순서대로 넣음.
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
}

}

class Song { // 음악 정보 저장 (인덱스(고유번호), 음악 재생 수)
    int idx;
    int play;

    Song(int idx, int play){
        this.idx = idx;
        this.play = play;
    }
}