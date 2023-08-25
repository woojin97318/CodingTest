class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (String str : my_string.split("")) {
            if (str.charAt(0) >= 97) {
                answer += str.toUpperCase();
            } else {
                answer += str.toLowerCase();
            }
        }
        
        return answer;
    }
}