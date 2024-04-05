class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int clickCnt = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char target = targets[i].charAt(j);
                int minCnt = Integer.MAX_VALUE;
                for (String key : keymap) {
                    if (key.indexOf(target) != -1 && key.indexOf(target) + 1 < minCnt) {
                        minCnt = key.indexOf(target) + 1;
                    }
                }
                
                if (minCnt == Integer.MAX_VALUE) {
                    clickCnt = -1;
                    break;
                } else {
                    clickCnt += minCnt;
                }
            }
            
            answer[i] = clickCnt;
        }
        
        return answer;
    }
}