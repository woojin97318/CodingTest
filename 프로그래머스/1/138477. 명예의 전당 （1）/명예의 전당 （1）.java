import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> hallOfFame = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);
            Collections.sort(hallOfFame, Collections.reverseOrder());
            answer[i] = hallOfFame.get(hallOfFame.size() < k ? hallOfFame.size() - 1 : k - 1);
        }
        
        return answer;
    }
}