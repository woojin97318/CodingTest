class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (String str : s.split("")) {
            char c = str.charAt(0);
            if (c == 32) {
                answer += " ";
            } else if (Character.isLowerCase(str.charAt(0))) {
                answer += Character.toString('a' + (c - 'a' + n) % 26);
            } else {
                answer += Character.toString('A' + (c - 'A' + n) % 26);
            }
        }
        
        return answer;
    }
}