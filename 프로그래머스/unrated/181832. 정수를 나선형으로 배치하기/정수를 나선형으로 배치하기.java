class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int[] position = {0, 0};
        int direction = 0;
        for (int i = 1; i <= n * n; i++) {
            answer[position[0]][position[1]] = i;
            
            if (direction % 4 == 0) {
                // right
                if (position[1] + 1 < n && answer[position[0]][position[1] + 1] == 0) {
                    position[1] += 1;
                } else {
                    position[0] += 1;
                    direction += 1;
                }
            } else if (direction % 4 == 1) {
                // down
                if (position[0] + 1 < n && answer[position[0] + 1][position[1]] == 0) {
                    position[0] += 1;
                } else {
                    position[1] -= 1;
                    direction += 1;
                }
            } else if (direction % 4 == 2) {
                // left
                if (position[1] - 1 >= 0 && answer[position[0]][position[1] - 1] == 0) {
                    position[1] -= 1;
                } else {
                    position[0] -= 1;
                    direction += 1;
                }
            } else if (direction % 4 == 3) {
                // top
                if (position[0] - 1 >= 0 && answer[position[0] - 1][position[1]] == 0) {
                    position[0] -= 1;
                } else {
                    position[1] += 1;
                    direction += 1;
                }
            }
        }
        
        return answer;
    }
}