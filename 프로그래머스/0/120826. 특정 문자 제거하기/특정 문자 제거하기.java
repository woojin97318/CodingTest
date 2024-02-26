import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}