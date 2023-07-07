class Solution {
    public int solution(int a, int b, int c) {
        int paramsSum = a + b + c;
        
        if (a != b && b != c && c != a) {
            return paramsSum;
        } else if (a == b && b == c) {
            return paramsSum * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            return paramsSum * (a * a + b * b + c * c);
        }
    }
}