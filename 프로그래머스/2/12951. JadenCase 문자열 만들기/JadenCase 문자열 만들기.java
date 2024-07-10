class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] sArr = s.split(" ", -1);
        
        for (int i = 0; i < sArr.length; i++) {
            String str = sArr[i];
            
            if (!str.equals("")) {
                String firstStr = str.substring(0, 1);
            
                if (firstStr.matches("[a-zA-Z]")) {
                    answer
                        .append(firstStr.toUpperCase())
                        .append(str.substring(1).toLowerCase());
                } else {
                    answer.append(str.toLowerCase());
                }
            }
            
            if (i < sArr.length - 1) {
                answer.append(" ");
            }
        }
        
        return answer.toString();
    }
}