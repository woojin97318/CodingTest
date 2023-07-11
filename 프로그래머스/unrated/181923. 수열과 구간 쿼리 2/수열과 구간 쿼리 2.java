class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int arrMin = 1_000_000;
            for (int j = s; j <= e; j++) {
                if (k < arr[j] && arrMin > arr[j]) {
                    arrMin = arr[j];
                }
            }
            answer[i] = arrMin == 1_000_000 ? -1 : arrMin;
        }
        
        return answer;
    }
}