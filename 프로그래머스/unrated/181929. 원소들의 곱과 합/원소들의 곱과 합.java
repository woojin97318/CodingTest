class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int prod = 1;
        
        for (int i : num_list) {
            sum += i;
            prod *= i;
        }
        
        return prod < sum * sum ? 1 : 0;
    }
}