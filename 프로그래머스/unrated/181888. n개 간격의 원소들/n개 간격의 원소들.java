class Solution {
    public int[] solution(int[] num_list, int n) {
        int arrLength = num_list.length % n > 0
            ? num_list.length / n + 1
            : num_list.length / n;
        int[] answer = new int[arrLength];
        
        int index = 0;
        for (int i = 0; i < num_list.length; i += n) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}