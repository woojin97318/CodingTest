class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int x = 0; x < commands.length; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            
            // i부터 j까지 자른 배열
            int[] arr = new int[j - i + 1];
            
            int index = 0;
            for (int y = i - 1; y < j; y++) {
                arr[index++] = array[y];
            }
            
            // arr 오름차순 정렬 (선택정렬)
            for (int y = 0; y < arr.length; y++) {
                for (int z = y + 1; z < arr.length; z++) {
                    if (arr[y] > arr[z])
                        swap(arr, y, z);
                }
            }
            
            // arr의 k번째 숫자
            answer[x] = arr[k - 1];
        }
        
        return answer;
    }
    
    private int[] swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
        
        return array;
    }
    
}

// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[] array, int[][] commands) {
//         int[] answer = new int[commands.length];
        
//         for (int i = 0; i < commands.length; i++) {
//             int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
//             Arrays.sort(arr);
//             answer[i] = arr[commands[i][2] - 1];
//         }
        
//         return answer;
//     }
// }