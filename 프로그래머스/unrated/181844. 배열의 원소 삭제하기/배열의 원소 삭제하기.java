import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = Arrays.stream(arr)
            .boxed()
            .collect(Collectors.toList());
        
        List<Integer> deleteList = Arrays.stream(delete_list)
            .boxed()
            .collect(Collectors.toList());
        
        // list.removeAll(deleteList);
        
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int num : deleteList) {
                if (list.get(i) == num) {
                    list.remove(i);
                    break;
                }
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}