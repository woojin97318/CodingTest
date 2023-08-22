class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        
        for (int i = 1; i < strArr.length; i += 2) {
            switch(strArr[i]) {
                case "+":
                    answer += Integer.parseInt(strArr[i + 1]);
                    break;
                case "-":
                    answer -= Integer.parseInt(strArr[i + 1]);
                    break;
            }
        }
        
        return answer;
    }
}