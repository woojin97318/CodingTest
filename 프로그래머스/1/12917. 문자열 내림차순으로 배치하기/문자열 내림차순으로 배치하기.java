import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return s.chars()
            .mapToObj(c -> (char) c)
            .sorted(Comparator.reverseOrder())
            .map(Object::toString)
            .collect(Collectors.joining());
    }
}

// import java.util.List;
// import java.util.ArrayList;
// import java.util.Collections;

// class Solution {
//     public String solution(String s) {
//         String answer = "";
        
//         List<Character> list = new ArrayList<>();
//         for (String str : s.split("")) {
//             list.add(str.charAt(0));
//         }
        
//         Collections.sort(list, Collections.reverseOrder());
        
//         for (Character c : list) {
//             answer += String.valueOf(c);
//         }
        
//         return answer;
//     }
// }