class Solution {
    public int solution(long num) {
        if (num == 1) return 0;
        
        int answer = 0;
        
        for (int i = 1; i <= 500; i++) {
            answer = i;
            
            if (num % 2 == 0)
                num /= 2;
            else
                num = num * 3 + 1;
            
            if (num == 1) break;
        }
        
        return answer == 500 && num != 1 ? -1 : answer;
    }
}