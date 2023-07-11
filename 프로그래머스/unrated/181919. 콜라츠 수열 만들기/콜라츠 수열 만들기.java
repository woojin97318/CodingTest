import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int x = n;
        
        List<Integer> list = new ArrayList<>();
        list.add(x);
        
        while(true) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
            list.add(x);
            
            if (x == 1) break;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}