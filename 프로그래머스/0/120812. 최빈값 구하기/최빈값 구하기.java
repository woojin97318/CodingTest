import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : array) {
            if (map.containsKey(val))
                map.put(val, map.get(val) + 1);
            else
                map.put(val, 1);
        }
        
        int maxVal = Integer.MIN_VALUE;
        List<Integer> maxKeys = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > maxVal) {
                maxVal = value;
                maxKeys.clear();
                maxKeys.add(entry.getKey());
            } else if (value == maxVal) {
                maxKeys.add(entry.getKey());
            }
        }
        
        if (maxKeys.size() > 1)
            return -1;
        else
            return maxKeys.get(0);
    }
}