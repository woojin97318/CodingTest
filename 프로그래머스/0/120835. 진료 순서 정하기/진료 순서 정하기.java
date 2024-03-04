import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {
        int[] _emergency = Arrays.stream(emergency)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < _emergency.length; i++) {
            map.put(_emergency[i], i + 1);
        }
        
        return Arrays.stream(emergency).map(i -> map.get(i)).toArray();
    }
}