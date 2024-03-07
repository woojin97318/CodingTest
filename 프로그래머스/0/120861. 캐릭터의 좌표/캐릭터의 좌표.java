class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (String key : keyinput) {
            switch (key) {
                case "up" :
                    if (answer[1] < maxY) answer[1] += 1;
                    break;
                case "down" :
                    if (answer[1] > maxY * -1) answer[1] -= 1;
                    break;
                case "left" :
                    if (answer[0] > maxX * -1) answer[0] -= 1;
                    break;
                case "right" :
                    if (answer[0] < maxX) answer[0] += 1;
                    break;
            }
        }
        
        return answer;
    }
}