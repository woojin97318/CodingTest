class Solution {
    public int solution(int[][] dots) {
        if (
            ((double) (dots[1][1] - dots[0][1]) / (double) (dots[1][0] - dots[0][0])) // [x1, y1], [x2, y2] 기울기
            ==
            ((double) (dots[3][1] - dots[2][1]) / (double) (dots[3][0] - dots[2][0])) // [x3, y3], [x4, y4] 기울기
            ||
            ((double) (dots[2][1] - dots[0][1]) / (double) (dots[2][0] - dots[0][0])) // [x1, y1], [x3, y3] 기울기
            ==
            ((double) (dots[3][1] - dots[1][1]) / (double) (dots[3][0] - dots[1][0])) // [x2, y2], [x4, y4] 기울기
            ||
            ((double) (dots[3][1] - dots[0][1]) / (double) (dots[3][0] - dots[0][0])) // [x1, y1], [x4, y4] 기울기
            ==
            ((double) (dots[2][1] - dots[1][1]) / (double) (dots[2][0] - dots[1][0])) // [x2, y2], [x3, y3] 기울기
        ) {
            return 1;
        }
        
        return 0;
    }
}