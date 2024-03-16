class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 3진법으로 변환
        // 앞뒤로 반전된 값 도출
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(String.valueOf(n % 3));
            n /= 3;
        }
        
        // 10진법으로 변환
        for (int i = 0; i < sb.length(); i++) {
            answer += Integer.valueOf(Character.toString(sb.charAt(i))) * Math.pow(3, sb.length() - i - 1);
        }
        
        return answer;
    }
}