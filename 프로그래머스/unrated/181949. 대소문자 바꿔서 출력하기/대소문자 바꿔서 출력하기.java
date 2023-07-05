import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] strArr = a.toCharArray();
        for (char str : strArr) {
            int tmp = (int) str;
            if (65 <= tmp && tmp <= 90) {
                tmp += 32;
                System.out.print((char) tmp);
            } else {
                tmp -= 32;
                System.out.print((char) tmp);
            }
        }
    }
}