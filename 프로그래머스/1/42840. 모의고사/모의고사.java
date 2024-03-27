import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] md1 = {1, 2, 3, 4, 5};
        int[] md2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] md3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int md1Cnt = 0;
        int md2Cnt = 0;
        int md3Cnt = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == md1[i % md1.length]) md1Cnt++;
            if (answers[i] == md2[i % md2.length]) md2Cnt++;
            if (answers[i] == md3[i % md3.length]) md3Cnt++;
        }
        
        int max = Math.max(md1Cnt, Math.max(md2Cnt, md3Cnt));
        if (md1Cnt == max) answer.add(1);
        if (md2Cnt == max) answer.add(2);
        if (md3Cnt == max) answer.add(3);
        
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}