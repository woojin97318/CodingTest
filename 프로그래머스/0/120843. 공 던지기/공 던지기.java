class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        
        for (int i = 0; i < k * 2; i += 2) {
            answer = numbers[i % len];
        }
        
        return answer;
    }
}