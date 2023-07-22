class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (String str : myString.split("")) {
            if (str.equals("a") || str.equals("A"))
                answer += str.toUpperCase();
            else
                answer += str.toLowerCase();
        }
        
        return answer;
    }
}