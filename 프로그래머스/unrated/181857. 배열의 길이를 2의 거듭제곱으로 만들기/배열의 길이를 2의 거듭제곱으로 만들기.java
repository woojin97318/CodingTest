class Solution {
    public int[] solution(int[] arr) {
        int index = 0;
        while (true) {
            if ((int) Math.pow(2, index) >= arr.length)
                break;
            else
                index++;
        }
        
        int answerLength = (int) Math.pow(2, index);
        if (answerLength == arr.length) {
            return arr;
        } else {
            int[] answer = new int[answerLength];
            for (int i = 0; i < answerLength; i++) {
                answer[i] = i < arr.length ? arr[i] : 0;
            }
            return answer;
        }
    }
}