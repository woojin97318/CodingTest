import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x == y && y == z) {
            System.out.println(10000 + x * 1000);
        } else if (x != y && x != z && y != z) {
            int max = x > y ? (x > z ? x : z) : (y > z ? y : z);
            System.out.println(max * 100);
        } else {
            int sameNumber;
            if (x == y || y == z) {
                sameNumber = y;
            } else {
                sameNumber = x;
            }
            System.out.println(1000 + sameNumber * 100);
        }
    }
}