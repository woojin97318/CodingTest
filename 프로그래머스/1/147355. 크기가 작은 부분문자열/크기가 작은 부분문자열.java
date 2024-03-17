class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length();
        int pLen = p.length();
        long pNum = Long.valueOf(p);
        
        for (int i = 0; i < tLen - pLen + 1; i++) {
            if (pNum >= Long.valueOf(t.substring(i, pLen + i)))
                answer++;
        }
        
        return answer;
    }
}