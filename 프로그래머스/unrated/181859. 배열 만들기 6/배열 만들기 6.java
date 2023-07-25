import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!stk.isEmpty() && stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
            } else {
                stk.add(arr[i]);
            }
        }
        
        return stk.size() == 0 ? new int[]{-1} : stk.stream().mapToInt(Integer::intValue).toArray();
    }
}