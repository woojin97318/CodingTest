class Solution {
    public boolean solution(int x) {
        /** for문을 이용한 방법 */
        int sum = 0;
        for (String num : String.valueOf(x).split("")) {
            sum += Integer.valueOf(num);
        }
        
        /** stream을 이용한 방법 1 */
        // int sum = String.valueOf(x).chars()
        //     .map(ch -> ch - '0')
        //     .sum();
        
        /** stream을 이용한 방법 2 */
        // int sum = String.valueOf(x).chars()
        //     .map(Character::getNumericValue)
        //     .sum();
        
        return x % sum == 0 ? true : false;
    }
}