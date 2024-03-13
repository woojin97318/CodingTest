class Solution {
    public long solution(long n) {
        long answer = 0;
        
        if (Math.sqrt(n) == (int) Math.sqrt(n)) {
            long x = (long) Math.sqrt(n);
            answer = (x + 1) * (x + 1);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}