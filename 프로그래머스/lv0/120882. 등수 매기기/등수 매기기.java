class Solution {
    public int[] solution(int[][] score) {
        int scoreLen = score.length;
        int[] answer = new int[scoreLen];
        float[] average = new float[scoreLen];
        
        for (int i = 0; i < scoreLen; i++) {
            average[i] = (float) ((score[i][0] + score[i][1]) / 2.0);
        }
        
        for (int i = 0; i < scoreLen; i++) {
            int rank = 1;
            for (int j = 0; j < scoreLen; j++) {
                if (average[i] < average[j])
                    rank++;
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}