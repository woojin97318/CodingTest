class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (; i <= j; i++) {
            for (String str : Integer.toString(i).split("")) {
                if (str.equals(Integer.toString(k)))
                    answer++;
            }
        }
        
        return answer;
    }
}