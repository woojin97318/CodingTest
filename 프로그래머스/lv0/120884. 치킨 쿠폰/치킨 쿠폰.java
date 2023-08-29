class Solution {
    public int solution(int chicken) {
        int serviceChicken = chicken / 10;
        int answer = serviceChicken;
        int coupon = chicken % 10;
        
        while (chicken >= 10) {
            chicken = serviceChicken;
            serviceChicken = chicken / 10;
            answer += serviceChicken;
            coupon += chicken % 10;
            
            if (coupon >= 10) {
                coupon = coupon - 10 + 1;
                answer++;
            }
        }
        
        return answer;
    }
}