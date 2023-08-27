import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer = array[0];
        int diff = Math.abs(array[0] - n);
        
        for (int i = 1; i < array.length; i++) {
            int currDiff = Math.abs(array[i] - n);
            
            if (currDiff < diff) {
                answer = array[i];
                diff = currDiff;
            }
        }
        
        return answer;
    }
}