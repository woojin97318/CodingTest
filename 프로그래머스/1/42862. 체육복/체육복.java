import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        /**
         * students 배열의 요소
         * 0 -> 체육복이 없는 학생
         * 1 -> 자신의 체육복이 있는 학생
         * 2 -> 여벌의 체육복이 있는 학생
         */
        int[] students = new int[n];
        Arrays.fill(students, 1);
        for (int num : reserve) {
            students[num - 1] += 1;
        }
        for (int num : lost) {
            students[num - 1] -= 1;
        }
        
        for (int i = 0; i < students.length; i++) {
            // front - 현재 학생의 체육복이 없을때 앞 학생이 여벌을 가지고 있는 경우 빌림
            if (students[i] == 0 && i > 0 && students[i - 1] == 2) {
                students[i - 1] = 1;
                students[i] = 1;
            }
            // rear - 현재 학생의 체육복이 없을때 뒤 학생이 여벌을 가지고 있는 경우 빌림
            if (students[i] == 0 && i < students.length - 1 && students[i + 1] == 2) {
                students[i + 1] = 1;
                students[i] = 1;
            }
        }
        
        return (int) Arrays.stream(students).filter(i -> i != 0).count();
    }
}