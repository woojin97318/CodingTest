import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, absolutes.length)
            .map(i -> signs[i] ? absolutes[i] : -absolutes[i])
            .sum();
    }
}

// class Solution {
//     public int solution(int[] absolutes, boolean[] signs) {
//         int answer = 0;
        
//         for (int i = 0; i < absolutes.length; i++) {
//             answer += signs[i] ? absolutes[i] : -absolutes[i];
//         }
        
//         return answer;
//     }
// }