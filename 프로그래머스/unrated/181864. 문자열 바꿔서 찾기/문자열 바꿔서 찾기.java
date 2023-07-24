class Solution {
    public int solution(String myString, String pat) {
        String changeMyString = "";
        for (String str : myString.split("")) {
            changeMyString += str.equals("A") ? "B" : "A";
        }
        
        return changeMyString.contains(pat) ? 1 : 0;
    }
}