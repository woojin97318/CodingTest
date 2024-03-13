import java.util.stream.LongStream;

class Solution {
    public int[] solution(long n) {
        return LongStream.iterate(n, i -> i / 10)
            .limit(String.valueOf(n).length())
            .mapToInt(i -> (int) (i % 10))
            .toArray();
    }
}