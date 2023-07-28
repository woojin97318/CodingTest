class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        boolean flag = false;
        for (String str : n_str.split("")) {
            if (!flag) {
                 if (!str.equals("0")) {
                     answer += str;
                     flag = true;
                 }
            } else {
                answer += str;
            }     
        }
        
        return answer;
    }
}