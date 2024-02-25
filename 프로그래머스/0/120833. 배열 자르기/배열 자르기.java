import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.range(num1, num2 + 1)
            .map(i -> numbers[i])
            .toArray();
    }
}