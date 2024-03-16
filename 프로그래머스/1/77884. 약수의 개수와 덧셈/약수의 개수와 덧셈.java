import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right).map(i -> (IntStream.rangeClosed(1, i).filter(j -> i % j == 0).count()) % 2 == 0 ? i : -i).sum();
    }
}