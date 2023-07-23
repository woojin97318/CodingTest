class Solution {
    public int[] solution(String myString) {
        int answerLength =
            myString.substring(myString.length() - 1).equals("x")
            ? myString.split("x").length + 1
            : myString.split("x").length ;
        
        int[] answer = new int[answerLength];
        
        String[] strArr = myString.split("x");
        
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = strArr[i].length();
        }
        
        return answer;
    }
}