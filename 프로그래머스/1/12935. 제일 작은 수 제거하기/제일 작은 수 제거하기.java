import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        
        for (int num : arr) {
            list.add(num);
            
            if (num < min)
                min = num;
        }
        
        // 가작 작은 요소 제거
        list.remove(Integer.valueOf(min));
        
        // 배열로 변환하여 리턴
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}