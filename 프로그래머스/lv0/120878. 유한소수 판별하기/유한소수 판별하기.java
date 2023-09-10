import java.util.*;

class Solution {
    public int solution(int a, int b) {
        // 기약분수로 변환
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        
        // b(분모)의 약수 (1 제외)
        List<Integer> list = new ArrayList<>();
        for (int i = b - 1; i > 0; i--) {
            if (b % i == 0) {
                list.add(b / i);
            }
        }
        
        // 약수중에서 소수 판단
        for (int num : list) {
            boolean flag = true; // 소수 여부
            
            for (int i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            
            // b의 약수중 소수가 2, 5 가 아닌 경우 무한소수
            if (flag) {
                if (num != 2 && num != 5)
                    return 2;
            }
        }
        
        return 1;
    }
}