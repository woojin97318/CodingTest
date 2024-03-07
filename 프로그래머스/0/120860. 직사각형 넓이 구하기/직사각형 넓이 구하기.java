class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;
        
        for (int i = 1; i < 4; i++) {
            if (dots[0][0] == dots[i][0])
                height = Math.abs(dots[0][1] - dots[i][1]);
            if (dots[0][1] == dots[i][1])
                width = Math.abs(dots[0][0] - dots[i][0]);
        }
        
        return width * height;
    }
}