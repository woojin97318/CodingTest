// "aya", "ye", "woo", "ma" 네 가지 발음
// 조합해서 만들 수 있는 발음
// 연속해서 같은 발음을 하는 것을 어려워함

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (babbling[i].contains(arr[j] + arr[j])) { // 연속된 발음은 pass
                    break;
                } else { // 연속된 발음이 없는 경우
                    babbling[i] = babbling[i].replaceAll(arr[j], "/");
                    if (babbling[i].replaceAll("/", "").equals("")) {
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}