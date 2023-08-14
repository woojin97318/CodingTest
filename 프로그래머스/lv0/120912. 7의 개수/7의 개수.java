class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int num : array) {
            for (String str : String.valueOf(num).split("")) {
                if (str.equals("7"))
                    answer++;
            }
        }
        
        return answer;
    }
}