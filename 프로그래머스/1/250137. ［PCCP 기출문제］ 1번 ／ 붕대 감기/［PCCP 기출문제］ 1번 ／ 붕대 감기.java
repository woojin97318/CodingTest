class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;

        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량
        int consecutiveSuccess = 0; // 연속 성공 횟수
        int attacksIdx = 0; // 공격 턴 index

        // 0초부터 마지막 공격시점까지 반복
        for (int i = 0; i <= attacks[attacks.length - 1][0]; i++) {
            if (attacks[attacksIdx][0] == i) { // 공격 시점
                answer -= attacks[attacksIdx++][1];
                if (answer <= 0) return -1;
                consecutiveSuccess = 0;
            } else if (answer < health) { // 회복 시점 (풀피가 아닌 경우에만 실행)
                consecutiveSuccess++;

                if (t == consecutiveSuccess) {
                    answer += (x + y);
                    consecutiveSuccess = 0;
                } else {
                    answer += x;
                }

                if (answer > health) answer = health;
            }
        }

        return answer;
    }
}