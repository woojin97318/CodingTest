import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        PriorityQueue<String> xPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<String> yPq = new PriorityQueue<>(Collections.reverseOrder());
        xPq.addAll(Arrays.asList(X.split("")));
        yPq.addAll(Arrays.asList(Y.split("")));

        List<String> kList = new ArrayList<>();

        while (!xPq.isEmpty() && !yPq.isEmpty()) {
            if (xPq.peek().equals(yPq.peek())) {
                kList.add(xPq.poll());
                yPq.poll();
            } else if (Integer.parseInt(xPq.peek()) > Integer.parseInt(yPq.peek())) {
                xPq.poll();
            } else {
                yPq.poll();
            }
        }

        if (kList.size() == 0) {
            answer = "-1";
        } else if (kList.get(0).equals("0")) {
            answer = "0";
        } else {
            answer = String.join("", kList);
        }

        return answer;
    }
}