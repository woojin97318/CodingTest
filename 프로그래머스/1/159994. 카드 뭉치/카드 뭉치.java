import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        Queue<String> goalQueue = new LinkedList<>();
        for (String g : goal) {
            goalQueue.offer(g);
        }
        Queue<String> queue1 = new LinkedList<>();
        for (int i = 0; i < cards1.length; i++) {
            queue1.offer(cards1[i]);
        }
        Queue<String> queue2 = new LinkedList<>();
        for (int i = 0; i < cards2.length; i++) {
            queue2.offer(cards2[i]);
        }
        
        while (!goalQueue.isEmpty()) {
            if (!queue1.isEmpty() && queue1.peek().equals(goalQueue.peek())) {
                queue1.poll();
                goalQueue.poll();
            } else if (!queue2.isEmpty() && queue2.peek().equals(goalQueue.peek())) {
                queue2.poll();
                goalQueue.poll();
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}