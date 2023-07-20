import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] beforeArr = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] afterArr = Arrays.copyOf(num_list, n);
        
        int[] answer = new int[beforeArr.length + afterArr.length];
        
        int index = 0;
        for (int i = 0; i < beforeArr.length; i++) {
            answer[index++] = beforeArr[i];
        }
        for (int i = 0; i < afterArr.length; i++) {
            answer[index++] = afterArr[i];
        }
        
        return answer;
    }
}