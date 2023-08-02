class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if (common[2] == 2 * common[1] - common[0]) {
            int commonDiff = common[1] - common[0];
            answer = common[common.length - 1] + commonDiff;
        } else {
            int commonRatio = common[1] / common[0];
            answer = common[common.length - 1] * commonRatio;
        }
        
        return answer;
    }
}