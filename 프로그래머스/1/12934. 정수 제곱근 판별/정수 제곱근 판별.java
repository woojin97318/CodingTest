class Solution {
    public long solution(long n) {
        long answer = 0;
        
        if (Math.sqrt(n) == (long) Math.sqrt(n)) {
            long x = (long) Math.sqrt(n);
            answer = (long) Math.pow(x + 1, 2);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}