import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        
        for (int num : arr) {
            if (num == 2) count++;
        }
        
        switch(count) {
            case 0 :
                return new int[]{-1};
            case 1 :
                return new int[]{2};
            default :
                List<Integer> list = new ArrayList<>();
                int index = 0;
                
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 2) index++;
                    if (index != 0) list.add(arr[i]);
                    if (index == count) break;
                }
                
                return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}