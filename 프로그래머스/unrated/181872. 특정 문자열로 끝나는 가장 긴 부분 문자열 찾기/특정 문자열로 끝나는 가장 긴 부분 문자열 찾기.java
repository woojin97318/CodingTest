class Solution {
    public String solution(String myString, String pat) {
        int endIndex = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.substring(i, i + pat.length()).equals(pat)) {
                endIndex = i + pat.length();
            }
        }
        
        return myString.substring(0, endIndex);
    }
}