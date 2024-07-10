class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.toLowerCase().split("");
        boolean flag = true;
        
        for (String str : sArr) {
            answer += flag ? str.toUpperCase() : str;
            flag = str.equals(" ") ? true : false;
        }
        
        return answer;
    }
}