class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for (int i = m; i <= my_string.length(); i += m) {
            answer += my_string.substring(i - m, i).split("")[c - 1];
        }
        
        return answer;
    }
}