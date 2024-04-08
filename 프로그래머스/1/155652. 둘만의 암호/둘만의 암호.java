class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < index; j++) {
                ch = plusCh(ch);
                while (skip.contains(Character.toString(ch))) {
                    ch = plusCh(ch);
                }
            }
            
            answer += Character.toString(ch);
        }

        return answer;
    }
    
    private char plusCh(char ch) {
        if (ch == 122) {
            return 'a';
        } else {
            return (char) (ch + 1);
        }
    }
}