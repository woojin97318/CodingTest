import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        String[] my_string_arr = my_string.split("");
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            List<String> list = new ArrayList<>();
            for (int i = e; i >= s; i--) {
                list.add(my_string_arr[i]);
            }
            
            int index = 0;
            for (int i = s; i <= e; i++) {
                my_string_arr[i] = list.get(index++);
            }
        }
        
        for (String str : my_string_arr) {
            answer += str;
        }
        
        return answer;
    }
}