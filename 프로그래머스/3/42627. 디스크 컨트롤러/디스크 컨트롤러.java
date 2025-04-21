import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 1) 요청 시간 기준으로 모든 작업 정렬
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

        // 2) 소요시간 기준 우선 처리 큐
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        int current = 0;
        int idx = 0;
        int total = 0;
        int completed = 0;

        while (completed < jobs.length) {

            // 현재 시간까지 요청된 작업을 우선순위 큐에 넣기
            while (idx < jobs.length && jobs[idx][0] <= current) {
                pq.offer(jobs[idx++]);
            }

            if (pq.isEmpty()) { 

                current = jobs[idx][0]; // 처리할 작업이 없으면 시간을 바로 점프시킴
            } else {
                int[] job = pq.poll();
                current += job[1]; // 작업 소요 시간 더하기
                total += (current - job[0]); // 반환시간 계산 (작업 완료시간 - 작업 요청시각)
                completed++;
            }
        }

        return total / jobs.length; // 평균 반환 시간
    }
}
