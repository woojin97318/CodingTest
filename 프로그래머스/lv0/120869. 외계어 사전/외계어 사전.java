import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<String> spellSet = new HashSet<>(Arrays.asList(spell));
        Set<String> strSet = new HashSet<>();
        
        for (String str : dic) {
            if (str.length() == spell.length) {
                strSet = new HashSet<>(Arrays.asList(str.split("")));
                
                if (strSet.equals(spellSet))
                    return 1;
            }
        }
        
        return 2;
    }
}