import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // report 중복 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        // k번 이상 신고 당한 사람을 저장하는 리스트
        List<String> suspendedUserList = new ArrayList<>();
        
        // 신고된 횟수를 저장하는 맵
        Map<String, Integer> reportCountMap = new HashMap<>();
        for (String str : reportSet) {
            String reportedUser = str.split(" ")[1];
            reportCountMap.put(reportedUser, reportCountMap.getOrDefault(reportedUser, 0) + 1);
        }

        // k번 이상 신고 당한 사용자를 suspendedUserList에 추가
        for (Map.Entry<String, Integer> entry : reportCountMap.entrySet()) {
            if (entry.getValue() >= k) {
                suspendedUserList.add(entry.getKey());
            }
        }

        // 각 사용자가 신고한 정지된 사용자 수를 저장하는 맵
        Map<String, Integer> userReportMap = new LinkedHashMap<>();
        for (String id : id_list) {
            userReportMap.put(id, 0);
        }

        // 정지된 사용자들을 신고한 사용자에 대한 처리
        for (String str : reportSet) {
            String[] splitStr = str.split(" ");
            String reportingUser = splitStr[0];
            String reportedUser = splitStr[1];

            if (suspendedUserList.contains(reportedUser)) {
                userReportMap.put(reportingUser, userReportMap.getOrDefault(reportingUser, 0) + 1);
            }
        }

        // 결과 배열에 각 사용자가 신고한 정지된 사용자 수를 저장
        int idx = 0;
        for (int count : userReportMap.values()) {
            answer[idx++] = count;
        }

        return answer;
    }
}