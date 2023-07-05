import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[28];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i <= 30; i++) {
            int cnt = 0;
            for(int num : arr) {
                if (i != num) {
                    cnt++;
                }
            }

            if (cnt == 28) {
                System.out.println(i);
            }
        }
    }
}