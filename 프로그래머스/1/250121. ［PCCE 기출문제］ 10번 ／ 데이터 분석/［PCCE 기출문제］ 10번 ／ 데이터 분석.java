import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx;
        if (ext.equals("code")) extIdx = 0;
        else if (ext.equals("date")) extIdx = 1;
        else if (ext.equals("maximum")) extIdx = 2;
        else extIdx = 3;
        
        int sortIdx;
        if (sort_by.equals("code")) sortIdx = 0;
        else if (sort_by.equals("date")) sortIdx = 1;
        else if (sort_by.equals("maximum")) sortIdx = 2;
        else sortIdx = 3;
        
        int[][] answer = Arrays.stream(data)
            .filter(arr -> arr[extIdx] < val_ext)
            .sorted(Comparator.comparingInt(arr -> arr[sortIdx]))
            .toArray(int[][]::new);
        
        return answer;
    }
}