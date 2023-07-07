class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int lastIndex = num_list.length - 1;
        int lastNum = num_list[lastIndex];
        int beforeLastNum = num_list[lastIndex - 1];
        
        if (lastNum > beforeLastNum) {
            answer[lastIndex + 1] = lastNum - beforeLastNum;
        } else {
            answer[lastIndex + 1] = lastNum * 2;
        }
        
        return answer;
    }
}