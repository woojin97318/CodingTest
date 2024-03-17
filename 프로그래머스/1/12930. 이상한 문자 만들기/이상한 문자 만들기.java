class Solution {
    public String solution(String s) {
        String answer = "";
        
        int index = 0;
        for (String str : s.split("")) {
            if (str.equals(" ")) {
                answer += str;
                index = 0;
            } else if (index % 2 == 0) {
                answer += str.toUpperCase();
                index++;
            } else {
                answer += str.toLowerCase();
                index++;
            }
        }
        
        return answer;
    }
}