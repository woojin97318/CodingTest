import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 번호 맞춘 갯수, 등수
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 1);
        map.put(5, 2);
        map.put(4, 3);
        map.put(3, 4);
        map.put(2, 5);
        map.put(1, 6);
        map.put(0, 6);
        
        // 지워진 숫자의 갯수
        int zeroCnt = (int) Arrays.stream(lottos).filter(i -> i == 0).count();
        
        // 지워지지 않은 숫자중 맞춘 갯수
        int sameNumCnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) continue;
            
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    sameNumCnt++;
                    break;
                }
            }
        }
        
        return new int[]{map.get(sameNumCnt + zeroCnt), map.get(sameNumCnt)};
    }
}