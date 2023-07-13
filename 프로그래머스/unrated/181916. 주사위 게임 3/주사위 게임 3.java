import java.util.Map;
import java.util.HashMap;
import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] arr = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        
        int[] pq = new int[2];
        int index = 0;
        
        switch(map.size()) {
            case 1 :
                answer = 1111 * a;
                break;
            case 2 :
                int p = 0;
                int q = 0;
                
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == 2) {
                        pq[index++] = entry.getKey();
                    } else if (entry.getValue() == 3) {
                        p = entry.getKey();
                    } else {
                        q = entry.getKey();
                    }
                }
                
                if (p == 0)
                    answer = (pq[0] + pq[1]) * Math.abs(pq[0] - pq[1]);
                else
                    answer = (10 * p + q) * (10 * p + q);
                
                break;
            case 3 :
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == 1) {
                        pq[index++] = entry.getKey();
                    }
                }
                
                answer = pq[0] * pq[1];
                break;
            case 4 :
                int min = 6;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getKey() < min) {
                        min = entry.getKey();
                    }
                }
                
                answer = min;
                break;
        }
        
        return answer;
    }
}