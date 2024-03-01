class Solution {
    public int solution(int n) {
        if (n == 1 || n == 2 || n == 3 || n == 6)
            return 1;
        
        int answer = 1;
        int slice = 6;
        while(true) {
            slice += 6;
            answer++;
            if (slice % n == 0)
                return answer;
        }
    }
}