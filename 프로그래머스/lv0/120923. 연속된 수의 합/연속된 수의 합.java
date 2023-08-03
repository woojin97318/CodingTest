class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int centerNum = total / num;
        int firstNum =
            num % 2 == 1
                ? centerNum - num / 2
                : centerNum - (num / 2 - 1);
        
        for (int i = 0; i < num; i++) {
            answer[i] = firstNum++;
        }
        
        return answer;
    }
}