class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        double[] failureRateArr = new double[N];
        for (int i = 0; i < answer.length; i++) {
            double numerator = 0;
            double denominator = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) numerator++;
                if (stages[j] >= i + 1) denominator++;
            }
            failureRateArr[i] = numerator == 0 ? 0 : numerator / denominator;
        }

        for (int i = 0; i < answer.length; i++) {
            int maxFailureRateIdx = 0;
            for (int j = 1; j < failureRateArr.length; j++) {
                if (failureRateArr[j] > failureRateArr[maxFailureRateIdx])
                    maxFailureRateIdx = j;
            }
            failureRateArr[maxFailureRateIdx] = -1;
            answer[i] = maxFailureRateIdx + 1;
        }

        return answer;
    }
}