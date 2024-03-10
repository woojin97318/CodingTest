class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 분모의 최소공배수
        answer[1] = lcm(denom1, denom2);
        
        // 분자 더하기
        numer1 *= answer[1] / denom1;
        numer2 *= answer[1] / denom2;
        answer[0] = numer1 + numer2;
        
        // 기약분수로 변환
        int gcd = gcd(answer[0], answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;
        
        return answer;
    }
    
    // 최대공약수
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}