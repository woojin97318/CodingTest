import java.util.stream.IntStream;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrimeNumber(nums[i] + nums[j] + nums[k]))
                        answer++;
                }
            }
        }

        return answer;
    }
    
    // 소수 판별
    private boolean isPrimeNumber(int num) {
        int cnt = (int) IntStream.rangeClosed(1, num).filter(i -> num % i == 0).count();
        return cnt == 2 ? true : false;
    }
}