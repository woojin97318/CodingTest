class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < answer.length; i++) {
            String[] str = quiz[i].split(" ");
            
            int X = Integer.parseInt(str[0]);
            int Y = Integer.parseInt(str[2]);
            int result = Integer.parseInt(str[4]);
            
            switch(str[1]) {
                case "+":
                    if (X + Y == result)
                        answer[i] = "O";
                    else
                        answer[i] = "X";
                    break;
                case "-":
                    if (X - Y == result)
                        answer[i] = "O";
                    else
                        answer[i] = "X";
                    break;
            }
        }
        
        return answer;
    }
}