import java.util.stream.Stream;

class Solution {
    public String[] solution(String myStr) {
        String str = myStr.replace("b", "a");
        str = str.replace("c", "a");
        
        String[] answer = Stream.of(str.split("a"))
            .filter(s -> !s.equals(""))
            .toArray(String[]::new);
        
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }
}