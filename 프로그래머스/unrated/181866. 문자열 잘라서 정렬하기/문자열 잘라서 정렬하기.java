import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        Arrays.sort(answer);
        
        return Stream.of(answer)
            .filter(str -> !str.equals(""))
            .toArray(String[]::new);
    }
}