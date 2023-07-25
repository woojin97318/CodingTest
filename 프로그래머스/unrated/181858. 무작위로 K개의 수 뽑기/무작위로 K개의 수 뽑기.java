import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        List<Integer> list = new ArrayList<>(set);
        if (list.size() > k) {
            for (int i = list.size() - 1; i >= k; i--) {
                list.remove(i);
            }
        } else if (list.size() < k) {
            for (int i = list.size(); i < k; i++) {
                list.add(-1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}