import java.util.stream.IntStream;

class Solution {
    public int solution(String my_string) {
        return IntStream.range(0, my_string.length())
            .mapToObj(i -> my_string.charAt(i))
            .filter(ch -> Character.isDigit(ch))
            .mapToInt(ch -> Character.getNumericValue(ch))
            .sum();
    }
}