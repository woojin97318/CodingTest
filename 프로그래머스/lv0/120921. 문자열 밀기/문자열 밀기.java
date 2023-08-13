class Solution {
    public int solution(String A, String B) {
        if (A.equals(B))
            return 0;
        
        int len = A.length();
        for (int i = 0; i < len; i++) {
            String shifted = A.substring(len - i) + A.substring(0, len - i);
            
            if (shifted.equals(B))
                return i;
        }

        return -1;
    }
}