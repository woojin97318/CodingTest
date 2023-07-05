class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            String codeIndex = code.substring(i, i + 1);
            
            if (mode == 0) {
                if (!codeIndex.equals("1")) {
                    if (i % 2 == 0) {
                        ret += codeIndex;
                    }
                } else {
                    mode = 1;
                }
            } else {
                if (!codeIndex.equals("1")) {
                    if (i % 2 == 1) {
                        ret += codeIndex;
                    }
                } else {
                    mode = 0;
                }
            }
        }
        
        return ret.equals("") ? "EMPTY" : ret;
    }
}