class Solution {
    public int solution(int n) {
        int nCnt = Integer.toBinaryString(n).replace("0", "").length();
        
        while (true) {
            if (nCnt == Integer.toBinaryString(++n).replace("0", "").length())
                return n;
        }
    }
}