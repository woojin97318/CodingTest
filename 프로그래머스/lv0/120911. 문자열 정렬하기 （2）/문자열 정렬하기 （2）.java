import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.toLowerCase().split("");
        Arrays.sort(answer);
        return Arrays.stream(answer).collect(Collectors.joining());
    }
}