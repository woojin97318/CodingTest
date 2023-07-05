class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char[] my_string_arr = my_string.toCharArray();
        char[] overwrite_string_arr = overwrite_string.toCharArray();
        
        for (int i = 0; i < overwrite_string_arr.length; i++) {
            my_string_arr[i + s] = overwrite_string_arr[i];
        }
        
        for (char str : my_string_arr) {
            answer += str;
        }
        
        return answer;
    }
}