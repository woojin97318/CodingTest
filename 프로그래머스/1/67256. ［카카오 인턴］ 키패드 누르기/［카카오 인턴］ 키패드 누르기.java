class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[] leftLoc = new int[]{3, 0};
        int[] rightLoc = new int[]{3, 2};

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                if (number == 1) leftLoc = new int[]{0, 0};
                if (number == 4) leftLoc = new int[]{1, 0};
                if (number == 7) leftLoc = new int[]{2, 0};
                answer.append("L");
            } else if (number == 3 || number == 6 || number == 9) {
                if (number == 3) rightLoc = new int[]{0, 2};
                if (number == 6) rightLoc = new int[]{1, 2};
                if (number == 9) rightLoc = new int[]{2, 2};
                answer.append("R");
            } else {
                int[] targetNumLoc = new int[2];
                if (number == 2) targetNumLoc = new int[]{0, 1};
                if (number == 5) targetNumLoc = new int[]{1, 1};
                if (number == 8) targetNumLoc = new int[]{2, 1};
                if (number == 0) targetNumLoc = new int[]{3, 1};
                
                int lDis = Math.abs(leftLoc[0] - targetNumLoc[0]) + Math.abs(leftLoc[1] - targetNumLoc[1]);
                int rDis = Math.abs(rightLoc[0] - targetNumLoc[0]) + Math.abs(rightLoc[1] - targetNumLoc[1]);
                
                if (lDis > rDis || lDis == rDis && hand.equals("right")) {
                    rightLoc = targetNumLoc;
                    answer.append("R");
                } else if (lDis < rDis || lDis == rDis && hand.equals("left")) {
                    leftLoc = targetNumLoc;
                    answer.append("L");
                }
            }
        }
        
        return answer.toString();
    }
}