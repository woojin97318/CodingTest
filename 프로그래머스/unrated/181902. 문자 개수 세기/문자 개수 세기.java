class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
         for (int i = 0; i < my_string.length(); i++) {
             int ascii = (int) my_string.charAt(i);
             
             if (65 <= ascii && ascii <= 90) {
                 answer[ascii - 65] += 1;
             } else {
                 answer[ascii - 71] += 1;
             }
         }
        
        return answer;
    }
}