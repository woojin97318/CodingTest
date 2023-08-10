import java.util.Arrays;

class Solution {
    public String[] solution(String my_str, int n) {
        int answerLen = my_str.length() % n == 0
            ? my_str.length() / n
            : my_str.length() / n + 1;
        String[] answer = new String[answerLen];
        
        int index = 0;
        for (int i = 0; i < my_str.length(); i += n) {
            int startIndex = i;
            int endIndex = my_str.length() > i + n ? i + n : my_str.length();
            
            String str = String.join("", Arrays.copyOfRange(my_str.split(""), startIndex, endIndex));
            answer[index++] = str;
        }
        
        return answer;
    }
}