import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String str : s.split("")) {
            if (map.containsKey(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }
        
        List<String> list = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                list.add(entry.getKey());
        }
        
        Collections.sort(list);
        
        return String.join("", list);
    }
}