import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // report 중복 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        // k번 이상 신고 당한 사람
        List<String> kHuman = new ArrayList<>();
        Map<String, Integer> kmap = new HashMap<>();
        for (String str : reportSet) {
            kmap.put(str.split(" ")[1], kmap.getOrDefault(str.split(" ")[1], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : kmap.entrySet()) {
            if (entry.getValue() >= k) {
                kHuman.add(entry.getKey());
            }
        }

        // key: 유저 ID, value: 정지된 ID
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String id : id_list) {
            map.put(id, 0);
        }

        for (String str : reportSet) {
            if (kHuman.contains(str.split(" ")[1])) {
                String key = str.split(" ")[0];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        
        int idx = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            answer[idx++] = entry.getValue();
        }

        return answer;
    }
}