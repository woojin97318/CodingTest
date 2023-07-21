class Solution {
    public String[] solution(String[] names) {
        int strLength = names.length % 5 > 0
            ? names.length / 5 + 1
            : names.length / 5;
        String[] answer = new String[strLength];
        
        int index = 0;
        for (int i = 0; i < names.length; i+=5) {
            answer[index++] = names[i];
        }
        
        return answer;
    }
}