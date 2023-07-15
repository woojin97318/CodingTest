class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        
        String[] strArr = my_string.split("");
        for (int i = e; i >= s; i--) {
            answer += strArr[i];
        }
        
        answer += my_string.substring(e + 1);
        return answer;
    }
}