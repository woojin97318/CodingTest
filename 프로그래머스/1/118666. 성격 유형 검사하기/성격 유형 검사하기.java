import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] != 4) {
                String key = String.valueOf(survey[i].charAt(choices[i] < 4 ? 0 : 1));
                map.put(key, map.getOrDefault(key, 0) + Math.abs(choices[i] - 4));
            }
        }

        if (map.getOrDefault("T", 0) > map.getOrDefault("R", 0)) answer += "T";
        else answer += "R";

        if (map.getOrDefault("F", 0) > map.getOrDefault("C", 0)) answer += "F";
        else answer += "C";

        if (map.getOrDefault("M", 0) > map.getOrDefault("J", 0)) answer += "M";
        else answer += "J";

        if (map.getOrDefault("N", 0) > map.getOrDefault("A", 0)) answer += "N";
        else answer += "A";

        return answer;
    }
}