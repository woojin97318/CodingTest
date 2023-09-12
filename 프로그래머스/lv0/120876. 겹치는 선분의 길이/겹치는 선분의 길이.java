import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        List<String> list = new ArrayList<>();
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                list.add("" + i + (i + 1));
            }
        }
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    set.add(list.get(i));
                }
            }
        }
        
        return set.size();
    }
}