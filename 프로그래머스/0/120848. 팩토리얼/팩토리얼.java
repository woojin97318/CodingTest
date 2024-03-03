import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int i = 1;
        while (true) {
            if (factorial(i) == n) return i;
            if (n < factorial(i)) return i - 1;
            i++;
        }
    }
    
    int factorial(int num) {
        return IntStream.rangeClosed(1, num).reduce(1, (x, y) -> x * y);
    }
}