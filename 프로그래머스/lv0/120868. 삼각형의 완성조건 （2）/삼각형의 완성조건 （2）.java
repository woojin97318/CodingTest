import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Set<Integer> set = new HashSet<>();
        
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        // sides 원소 중 큰 값이 가장 긴 변인 경우
        for (int i = max - min + 1; i <= max; i++) {
            set.add(i);
        }
        
        // 나머지 한 변이 가장 긴 변인 경우
        for (int i = max + min - 1; i >= max; i--) {
            set.add(i);
        }
        
        return set.size();
    }
}