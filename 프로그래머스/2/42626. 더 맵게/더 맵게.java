import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
    int answer = 0;
    PriorityQueue heap = new PriorityQueue<>(); // 기본으로 최소힙으로 구현
    int cntTarget = 0; // 대상이 되는 수

    if (K == 0){ // k가 0이면 무조건 되므로 0 리턴하고 끝
        return 0;
    }

    for (int i : scoville){ // 배열의 모든 값을 우선순위 큐에 넣음. 
        if (i < K){
            cntTarget++;
        }
        heap.offer(i); 
    }

    if (cntTarget == 0){ // 올릴게 하나도 없어도 0 리턴
        return 0;
    }

    while (heap.size() > 1) {
        int p1 = (int) heap.poll();
        int p2 = (int) heap.poll();

        if (p1 >= K && p2 >= K){ // 두개 뽑았는데 둘다 k보다 큰 경우 답을 리턴함.
            return answer;
        }

        else {
            heap.offer(p1 + p2 * 2); // 아니면 음식을 섞어서 다시 힙에 넣음.
            answer++;
        }
    }
    
    int last = (int) heap.poll(); // 마지막 원소가 하나 남은 경우

    if ( last >= K){
        return answer;
    }

    else {
        return -1;
    }
}
}