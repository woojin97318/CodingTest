import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        // 친구별 인덱스 map (key : friendName, value : index)
        Map<String, Integer> friendIdxMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            friendIdxMap.put(friends[i], i);
        }
        
        // 주고받은 선물 표
        int[][] giftArr = new int[friends.length][friends.length];
        for (String gift : gifts) {
            String[] giftInfo = gift.split(" ");
            String given = giftInfo[0];
            String received = giftInfo[1];
            
            int givenIdx = friendIdxMap.get(given);
            int receivedIdx = friendIdxMap.get(received);
            
            giftArr[givenIdx][receivedIdx] += 1;
        }
        
        // 선물지수 계산
        int[] giftScoreArr = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            int givenCnt = 0; // 준 선물 갯수
            int recivedCnt = 0; // 받은 선물 갯수
            
            // 주고받은 선물 갯수 계산
            for (int j = 0; j < friends.length; j++) {
                if (j != i) {
                    givenCnt += giftArr[i][j];
                    recivedCnt += giftArr[j][i];
                }
            }
            
            giftScoreArr[i] = givenCnt - recivedCnt;
        }
        
        // 다음달에 받을 선물 갯수 계산
        int[] revicedGiftCntArr = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (giftArr[i][j] > giftArr[j][i]) {
                    revicedGiftCntArr[i] += 1; // 준사람이 더 많이 줫을때
                } else if (giftArr[i][j] < giftArr[j][i]) {
                    revicedGiftCntArr[j] += 1; // 받은 사람이 더 많이 줘승ㄹ때
                } else {
                    // 같을떄 선물지수로 판별
                    if (giftScoreArr[i] > giftScoreArr[j]) {
                        revicedGiftCntArr[i] += 1;
                    } else if (giftScoreArr[i] < giftScoreArr[j]) {
                        revicedGiftCntArr[j] += 1;
                    }
                }
            }
        }
        
        // 가장 많이 받을 선물의 수 계산
        for (int count : revicedGiftCntArr) {
            if (count > answer) {
                answer = count;
            }
        }
        
        return answer;
    }
}