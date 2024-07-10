import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        PriorityQueue<Integer> aQueue = new PriorityQueue<>();
        PriorityQueue<Integer> bQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < A.length; i++) {
            aQueue.offer(A[i]);
            bQueue.offer(B[i]);
        }
        
        for (int i = 0; i < A.length; i++) {
            answer += aQueue.poll() * bQueue.poll();
        }

        return answer;
    }
}