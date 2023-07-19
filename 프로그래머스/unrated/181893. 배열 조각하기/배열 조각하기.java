import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        
        for (int i = 0; i < query.length; i++) {
            int query_num = query[i];
            
            if (i % 2 == 0) {
                list.subList(query_num + 1, list.size()).clear();
            } else {
                list.subList(0, query_num).clear();
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
