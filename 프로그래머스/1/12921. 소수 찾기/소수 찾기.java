class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i))
                answer++;
        }
        
        return answer;
    }
    
    private boolean isPrimeNumber(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }
}