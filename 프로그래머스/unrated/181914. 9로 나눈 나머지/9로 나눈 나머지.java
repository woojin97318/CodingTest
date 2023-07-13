class Solution {
    public int solution(String number) {
        int answer = 0;
        
        String[] numberArr = number.split("");
        for (String num : numberArr) {
            answer += Integer.parseInt(num);
        }
        
        return answer % 9;
    }
}