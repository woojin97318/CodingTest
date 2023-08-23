import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = n; i > 0; i--) {
            if (n % i == 0)
                list.add(i);
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}