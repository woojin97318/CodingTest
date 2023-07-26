import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (String str : strArr) {
            int strLen = str.length();
            
            if (map.get(strLen) == null)
                map.put(strLen, 1);
            else
                map.put(strLen, map.get(strLen) + 1);
        }
        
        int answer = 0;
        
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            
            if (answer < value)
                answer = value;
        }
        return answer;
    }
}