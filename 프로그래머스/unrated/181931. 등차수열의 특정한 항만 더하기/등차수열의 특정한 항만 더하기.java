import java.util.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int[] adArr = new int[included.length];
        for (int i = 0; i < adArr.length; i++) {
            if (i == 0) {
                adArr[i] = a;
            } else {
                adArr[i] = adArr[i - 1] + d;
            }
            
            if (included[i]) {
                answer += adArr[i];
            }
        }
        
        return answer;
    }
}