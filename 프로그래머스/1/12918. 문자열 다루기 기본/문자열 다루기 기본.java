class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6)
            return false;
        
        for (String str : s.split("")) {
            try {
                Integer.valueOf(str);
            } catch(NumberFormatException e) {
                return false;
            }
        }
        
        return true;
    }
}