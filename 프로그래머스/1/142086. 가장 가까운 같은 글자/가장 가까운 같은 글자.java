class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            int cnt = 1;
            for (int j = i; j > 0; j--) {
                if (s.charAt(i) == s.charAt(j - 1)) {
                    answer[i] = cnt;
                    break;
                }
                
                cnt++;
            }
            
            if (answer[i] == 0) answer[i] = -1;
        }
        
        return answer;
    }
}