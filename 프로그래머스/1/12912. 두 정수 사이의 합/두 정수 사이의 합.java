import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        return LongStream.rangeClosed(a, b).sum();
    }
}