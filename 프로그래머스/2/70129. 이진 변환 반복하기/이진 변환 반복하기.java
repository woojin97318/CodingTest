class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            answer[0]++;                                // 이진 변환 횟수
            String nextS = s.replace("0", "");          // 0 제거
            answer[1] += s.length() - nextS.length();   // 제거되는 0의 갯수
            s = Integer.toBinaryString(nextS.length()); // 이진 변환
        }
        
        return answer;
    }
}