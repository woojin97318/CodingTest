class Solution {
    public int solution(int n) {
        for (int i = 1000; i > 0; i--) {
            if (n % i == 0 && n / i == i)
                return 1;
        }
        
        return 2;
    }
}