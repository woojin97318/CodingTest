import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        return new int[]{
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(),
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 1).count()
        };
    }
}