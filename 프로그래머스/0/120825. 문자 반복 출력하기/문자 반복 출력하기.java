import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int n) {
        return my_string.chars()
            .mapToObj(c -> String.valueOf((char) c))
            .flatMap(str -> Stream.generate(() -> str).limit(n))
            .collect(Collectors.joining());
    }
}