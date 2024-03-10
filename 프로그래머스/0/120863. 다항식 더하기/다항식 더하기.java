class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xVal = 0;
        int cVal = 0;
        
        for (String terms : polynomial.split(" \\+ ")) {
            if (terms.contains("x"))
                xVal += terms.length() == 1 ? 1 : Integer.valueOf(terms.replace("x", ""));
            else
                cVal += Integer.valueOf(terms);
        }
        
        if (xVal == 1)
            answer += "x";
        else if (xVal > 1)
            answer += String.valueOf(xVal) + "x";
        
        if (cVal > 0)
            answer += answer.equals("") ? String.valueOf(cVal) : " + " + String.valueOf(cVal);
        
        return answer;
    }
}