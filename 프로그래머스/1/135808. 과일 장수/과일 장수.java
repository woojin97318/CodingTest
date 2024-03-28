import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        /**
         * 선택정렬 (시간초과)
         */
        // // score 내림차순
        // for (int i = 0; i < score.length - 1; i++) {
        //     for (int j = i + 1; j < score.length; j++) {
        //         if (score[j] > score[i]) {
        //             int tmp = score[i];
        //             score[i] = score[j];
        //             score[j] = tmp;
        //         }
        //     }
        // }
        //
        // // 상자에 담길 마지막 사과의 점수 * 갯수
        // for (int i = m - 1; i < score.length; i += m) {
        //     answer += score[i] * m;
        // }
        
        /**
         * 우선순위 큐(PriorityQueue) 사용
         */
        Queue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : score) {
            pQ.offer(s);
        }
        
        int idx = 1;
        while (!pQ.isEmpty()) {
            if (idx % m == 0)
                answer += pQ.peek() * m;
            pQ.remove();
            idx++;
        }
        
        return answer;
    }
}