import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // 내림차순 정렬
        // n과의 차이가 같은 경우 큰 수가 앞으로 와야 하는데 이를 위하여 정렬을 우선적으로 진행함.
        Arrays.sort(numlist);
        int[] reversedArr = new int[numlist.length];
        for (int i = 0, j = numlist.length; i < numlist.length; i++) {
            reversedArr[i] = numlist[--j];
        }
        
        // 내림차순으로 정렬된 reversedArr 순서가 보장된 LinkedHashSet으로 변환
        // Set을 사용한 이유는 remove()를 사용하여 answer에 삽입될 num을 set에서 제거하기 위함
        int[] answer = new int [numlist.length];
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : reversedArr) {
            set.add(num);
        }
        
        for (int i = 0; i < numlist.length; i++) {
            int minDiff = 10_000; // n과의 num 차이의 최댓값 + 1
            int minDiffNum = 0;
            
            Iterator<Integer> iterSet = set.iterator();
            while (iterSet.hasNext()) {
                int currNum = iterSet.next();
                int currDiff = Math.abs(n - currNum);
                
                if (currDiff < minDiff) {
                    minDiff = currDiff;
                    minDiffNum = currNum;
                }
            }
            
            answer[i] = minDiffNum;
            set.remove(minDiffNum);
        }
        
        return answer;
    }
}