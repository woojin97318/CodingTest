// import java.util.*;

// class Solution {
//     public int[] solution(int[] answers) {
//         List<Integer> answer = new ArrayList<>();
        
//         int[] md1 = {1, 2, 3, 4, 5};
//         int[] md2 = {2, 1, 2, 3, 2, 4, 2, 5};
//         int[] md3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//         int md1Cnt = 0;
//         int md2Cnt = 0;
//         int md3Cnt = 0;
        
//         for (int i = 0; i < answers.length; i++) {
//             if (answers[i] == md1[i % md1.length]) md1Cnt++;
//             if (answers[i] == md2[i % md2.length]) md2Cnt++;
//             if (answers[i] == md3[i % md3.length]) md3Cnt++;
//         }
        
//         int max = Math.max(md1Cnt, Math.max(md2Cnt, md3Cnt));
//         if (md1Cnt == max) answer.add(1);
//         if (md2Cnt == max) answer.add(2);
//         if (md3Cnt == max) answer.add(3);
        
//         return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
//     }
// }
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}