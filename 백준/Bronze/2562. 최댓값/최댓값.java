import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int index = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i-1] > max) {
                max = arr[i-1];
                index = i;
            }
        }

        System.out.println(String.format("%d\n%d", max, index));
    }
}