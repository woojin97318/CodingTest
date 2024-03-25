// 사진별로 추억 점수
// 인물의 그리움 점수를 모두 합산한 값
// 그리움 점수 없으면 x

import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (String[] pNames : photo) {
            int sum = 0;
            for (String pName : pNames) {
                if (map.get(pName) != null)
                    sum += map.get(pName);
            }
            answer.add(sum);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}