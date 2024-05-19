class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 로봇 강아지 시작 위치
        int i = 0, j = 0;
        for (int x = 0; x < park.length; x++) {
            if (park[x].indexOf("S") != -1) {
                i = x;
                j = park[x].indexOf("S");
                break;
            }
        }
        
        // 이동
        for (String route : routes) {
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            boolean bool = true;
            
            switch (direction) {
                case "E" :
                    if (j + distance < park[i].length()) { // 이동했을 때 park를 넘어가는지 확인
                        for (int x = 1; x <= distance; x++) {
                            if (park[i].charAt(j + x) == 'X') { // 한 칸씩 이동하며 장애물이 있는지 확인
                                bool = false;
                                break;
                            }
                        }
                        
                        if (bool) // 장애물이 있다면 명령 무시
                            j += distance;
                    }
                    break;
                case "W" :
                    if (j - distance >= 0) {
                        for (int x = 1; x <= distance; x++) {
                            if (park[i].charAt(j - x) == 'X') {
                                bool = false;
                                break;
                            }
                        }
                        
                        if (bool) j -= distance;
                    }
                    break;
                case "S" :
                    if (i + distance < park.length) {
                        for (int x = 1; x <= distance; x++) {
                            if (park[i + x].charAt(j) == 'X') {
                                bool = false;
                                break;
                            }
                        }
                        
                        if (bool) i += distance;
                    }
                    break;
                case "N" :
                    if (i - distance >= 0) {
                        for (int x = 1; x <= distance; x++) {
                            if (park[i - x].charAt(j) == 'X') {
                                bool = false;
                                break;
                            }
                        }
                        
                        if (bool) i -= distance;
                    }
                    break;
            }
        }
        
        return new int[]{i, j};
    }
}