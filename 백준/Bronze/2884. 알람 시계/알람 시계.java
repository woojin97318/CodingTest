import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            System.out.println(h + " " + (m - 45));
        } else {
            if(h == 0) {
                System.out.print(23 + " ");
            } else {
                System.out.print(h - 1 + " ");
            }
            System.out.println(m + 15);
        }
    }
}