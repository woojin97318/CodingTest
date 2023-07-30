import java.util.Arrays;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        Arrays.fill(answer, "");
        
        int index = 0;
        for (String pixel : picture) {
            String str = "";
            
            for (String pixelStr : pixel.split("")) {
                for (int i = 0; i < k; i++) {
                    str += pixelStr;
                }
            }
            
            for (int i = 0; i < k; i++) {
                answer[index++] = str;
            }
        }
        
        return answer;
    }
}