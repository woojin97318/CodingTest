import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        
        while(n % 2 == 0) {
            set.add(2);
            n /= 2;
        }
        
        for (int i = 3; i <= n * n; i += 2) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        
        if (n > 2) {
            set.add(n);
        }
        
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}