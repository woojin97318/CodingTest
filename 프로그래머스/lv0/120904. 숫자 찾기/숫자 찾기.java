class Solution {
    public int solution(int num, int k) {
        String[] arr = Integer.toString(num).split("");
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == k)
                return i + 1;
        }

        return -1;
    }
}