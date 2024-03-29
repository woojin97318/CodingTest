import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] wall = new int[n];
        for (int sNum : section) {
            wall[sNum - 1] = 1;
        }
        
        for (int i = 0; i < wall.length; i++) {
            if (wall[i] == 1) {
                answer += 1;
                
                try {
                    Arrays.fill(wall, i, i + m, 0);
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }

                i += (m - 1);
            }
        }
        
        return answer;
    }
}