class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[]{-1, -1, -1, -1};
        
        // lux
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                answer[0] = i;
                break;
            }
        }
        
        // luy
        int luy = wallpaper[0].length();
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#") && luy >= wallpaper[i].indexOf("#")) {
                luy = wallpaper[i].indexOf("#");
            }
        }
        answer[1] = luy;
        
        // rdx
        for (int i = wallpaper.length - 1; i >= 0; i--) {
            if (wallpaper[i].contains("#")) {
                answer[2] = i + 1;
                break;
            }
        }
        
        // rdy
        int rdy = 0;
        for (int i = wallpaper.length - 1; i >= 0; i--) {
            for (int j = wallpaper[0].length() - 1; j >= 0; j--) {
                if (wallpaper[i].charAt(j) == '#' && rdy <= j) {
                    rdy = j + 1;
                }
            }
        }
        answer[3] = rdy;
        
        return answer;
    }
}