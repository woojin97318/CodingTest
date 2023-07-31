class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
            char str = myString.charAt(i);
            
            if ((int) str < 108)
                answer += "l";
            else
                answer += str;
        }
        
        return answer;
    }
}