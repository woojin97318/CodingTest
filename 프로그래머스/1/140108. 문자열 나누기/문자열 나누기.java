class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int xCnt = 1;
        int notXCnt = 0;
        
        for (int i = 1; i < s.length(); i++) {
            if (x != s.charAt(i)) {
                notXCnt++;
            } else {
                xCnt++;
            }
            
            if (xCnt == notXCnt) {
                answer++;
                
                if (i + 1 == s.length()) {
                    break;
                } else {
                    x = s.charAt(++i);
                    xCnt = 1;
                    notXCnt = 0;
                }
            }
        }
        
        return xCnt != notXCnt ? answer + 1 : answer;
    }
}