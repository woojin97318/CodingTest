import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int[] indices) {
        List<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));
        
        Integer[] boxedIndices = new Integer[indices.length];
        for (int i = 0; i < indices.length; i++) {
            boxedIndices[i] = Integer.valueOf(indices[i]);
        }
        
        Arrays.sort(boxedIndices, Collections.reverseOrder());
        for (int index : boxedIndices) {
            list.remove(index);
        }
        
        return String.join("", list);
    }
}