class Solution {
    public int solution(int[][] board) {
        // board의 전체 칸 갯수
        int answer = board.length * board.length;
        
        // 2차원 배열 탐색
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // 지뢰지역 탐색
                if (board[i][j] == 1) {
                    // 지뢰지역에 인접한 칸 탐색
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
                            // 지뢰지역에 인접한 칸 중 board 범위에 해당하는 칸 탐색
                            if (x >= 0 && x < board.length && y >= 0 && y < board.length) {
                                // 해당 칸에 -1 대입
                                if (board[x][y] == 0) board[x][y] = -1;
                            }
                        }
                    }
                }
            }
        }
        
        // 전체 칸에서 지뢰가 있는 칸(1)과 지뢰에 인접한 칸(-1)을 제외한 안전한 지역 카운트
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1 || board[i][j] == -1)
                    answer -= 1;
            }
        }
        
        return answer;
    }
}