import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        return Arrays.stream(numbers)
            .boxed()
            .sorted((a, b) -> Integer.compare(b, a))
            .limit(2)
            .mapToInt(Integer::intValue)
            .reduce((a, b) -> a * b)
            .orElse(0);
    }
}