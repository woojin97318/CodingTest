import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            boolean flag = true;
            String[] arr = Integer.toString(i).split("");
            
            for (String str : arr) {
                if (!str.equals("0") && !str.equals("5")) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) list.add(i);
        }

        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}