import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        List<Integer> box = new ArrayList<>();
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (!box.isEmpty() && board[i][move - 1] == box.get(box.size() - 1)) {
                        answer += 2;
                        box.remove(box.size() - 1);
                    } else {
                        box.add(board[i][move - 1]);
                    }
                    
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}