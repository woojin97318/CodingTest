import java.util.Arrays;
import java.util.IntSummaryStatistics;

class Solution {
    public String solution(String s) {
        IntSummaryStatistics statistics = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
        
        return statistics.getMin() + " " + statistics.getMax();
    }
}