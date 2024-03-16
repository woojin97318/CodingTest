class Solution {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n, m), lcm(n, m)};
    }
    
    // 최대공약수
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    // 최소공배수
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}