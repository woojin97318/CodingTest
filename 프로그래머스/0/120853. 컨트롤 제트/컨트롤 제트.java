import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        for (String str : s.split(" ")) {
            if (str.equals("Z"))
                stack.pop();
            else
                stack.push(Integer.valueOf(str));
        }
        
        while(!stack.empty()) {
            answer += stack.pop();
        }
        
        return answer;
    }
}