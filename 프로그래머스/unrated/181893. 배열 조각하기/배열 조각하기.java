import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        
        for (int i = 0; i < query.length; i++) {
            int query_num = query[i];
            if (i % 2 == 0) {
                // 짝수 인덱스일 경우, 뒷부분을 잘라냄
                list.subList(query_num + 1, list.size()).clear();
            } else {
                // 홀수 인덱스일 경우, 앞부분을 잘라냄
                list.subList(0, query_num).clear();
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
        
//         for (int i = 0; i < query.length; i++) {
//             int query_num = query[i];
            
//             if (i % 2 == 0) {
//                 list = list.subList(0, query_num);
//             } else {
//                 list = list.subList(query_num + 1, list.size());
//             }
//         }
        
        // return list.stream().mapToInt(Integer::intValue).toArray();
    }
}