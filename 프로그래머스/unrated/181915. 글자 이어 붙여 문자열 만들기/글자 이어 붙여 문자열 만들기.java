class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        String[] strArr = my_string.split("");
        for (int index : index_list) {
            answer += strArr[index];
        }
        
        return answer;
    }
}