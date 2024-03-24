import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");
        
        int[][] _arr1 = new int[n][n];
        int[][] _arr2 = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                int k = arr1[i];
                arr1[i] = k / 2;
                _arr1[i][j] = k % 2;
                
                k = arr2[i];
                arr2[i] = k / 2;
                _arr2[i][j] = k % 2;
            }
            
            for (int j = 0; j < n; j++) {
                if (_arr1[i][j] == 1 || _arr2[i][j] == 1) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        
        return answer;
    }
}