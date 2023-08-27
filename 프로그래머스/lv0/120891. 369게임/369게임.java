class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for (String str : Integer.toString(order).split("")) {
            int num = Integer.parseInt(str);
            
            if (num == 3 || num == 6 || num == 9) {
                answer++;
            }
        }
        
        return answer;
    }
}