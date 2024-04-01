import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[]{-1, -1, -1};
        int idx = 0;
        
        for (String str : dartResult.split("")) {
            // 점수
            if (isNumeric(str)) {
                if (scores[idx] == -1)
                    scores[idx] = Integer.parseInt(str);
                else
                    scores[idx] = 10;
            }
            
            // 보너스
            if (str.equals("S") || str.equals("D") || str.equals("T")) {
                if (str.equals("D")) {
                    scores[idx] = (int) Math.pow(scores[idx], 2);
                }
                if (str.equals("T")) {
                    scores[idx] = (int) Math.pow(scores[idx], 3);
                }
                
                idx++;
            }
            
            // 옵션
            if (str.equals("*")) {
                scores[idx - 1] *= 2;
                if (idx - 1 > 0) scores[idx - 2] *= 2;
            } else if (str.equals("#")) {
                scores[idx - 1] *= -1;
            }
        }
        
        return Arrays.stream(scores).sum();
    }
    
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}