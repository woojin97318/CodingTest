class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] strArr = s.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("Z")) {
                answer -= Integer.valueOf(strArr[i - 1]);
            } else {
                answer += Integer.valueOf(strArr[i]);
            }
        }
        
        return answer;
    }
}