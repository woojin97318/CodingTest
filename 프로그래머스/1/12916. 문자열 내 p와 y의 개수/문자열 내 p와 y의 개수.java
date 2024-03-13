class Solution {
    boolean solution(String s) {
        int pCnt = (int) s.toLowerCase().chars().filter(c -> c == 'p').count();
        int yCnt = (int) s.toLowerCase().chars().filter(c -> c == 'y').count();
        
        return pCnt == yCnt ? true : false;
    }
}

// class Solution {
//     boolean solution(String s) {
//         int pCnt = 0;
//         int yCnt = 0;
        
//         for (String str : s.toLowerCase().split("")) {
//             if (str.equals("p")) pCnt++;
//             if (str.equals("y")) yCnt++;
//         }

//         return pCnt == yCnt ? true : false;
//     }
// }