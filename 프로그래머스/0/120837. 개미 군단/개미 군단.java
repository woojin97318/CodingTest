class Solution {
    public int solution(int hp) {
        int first = hp / 5;
        int secend = hp % 5 / 3;
        int third = hp % 5 % 3;
        
        return first + secend + third;
    }
}