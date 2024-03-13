import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        StringBuilder answer = new StringBuilder();
        
        List<String> list = new ArrayList<>();
        for (String str : String.valueOf(n).split("")) {
            list.add(str);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for (String str : list) {
            answer.append(str);
        }
        
        return Long.valueOf(answer.toString());
    }
}

/**
 * stream 풀이
 */

// import java.util.Comparator;

// class Solution {
//     public long solution(long n) {
//         return Long.valueOf(
//             String.valueOf(n).chars()
//                 .mapToObj(Character::toString)
//                 .sorted(Comparator.reverseOrder())
//                 .reduce("", (x, y) -> x + y)
//         );
//     }
// }